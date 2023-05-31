package task7.flyweight;

// внутреннее состояние: значения этих полей одинаковы
// для большого числа объектов;
// внешнее состояние (контекст): значения полей уникальны
// для каждого объекта.

public class Star {

    private SpectralType spectralType;

    public Star() {
        System.out.println("New star created");
        this.spectralType = SpectralType.G;
    }

    public Star setSpectralType(SpectralType spectralType) {
        this.spectralType = spectralType;
        return this;
    }
}
