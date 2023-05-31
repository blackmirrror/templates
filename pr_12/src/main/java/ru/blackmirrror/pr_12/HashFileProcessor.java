package ru.blackmirrror.pr_12;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
@Component
public class HashFileProcessor {

    @Autowired
    @Value("${hashFileProperties.inputFile}")
    private String inputFile;

    @Autowired
    @Value("${hashFileProperties.outputFile}")
    private String outputFile;

    public HashFileProcessor() {}

//    public HashFileProcessor(String inputFile, String outputFile) {
//        this.inputFile = inputFile;
//        this.outputFile = outputFile;
//    }

    @PostConstruct
    public void hashInputFile() throws IOException {
        File input = new File(inputFile);
        File output = new File(outputFile);

        if (!input.exists()) {
            Files.writeString(output.toPath(), "null", StandardCharsets.UTF_8);
        } else {
            String hash = DigestUtils.sha256Hex(Files.readString(input.toPath()));
            Files.writeString(output.toPath(), hash, StandardCharsets.UTF_8);
        }
    }

    @PreDestroy
    public void deleteInputFile() throws IOException {
        File input = new File(inputFile);
        if (input.exists()) {
            Files.delete(input.toPath());
        }
    }
}
