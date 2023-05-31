package task7.flyweight;

import task7.flyweight.SpectralType;
import task7.flyweight.Star;

import java.util.HashMap;
import java.util.Map;

// фабрика, которая будет кешировать
// и повторно отдавать уже созданные объекты.

public class StarFactory {
    private final Map<SpectralType, Star> stars = new HashMap<>();


    public Star createStar(SpectralType spectralType) {
        if (stars.containsKey(spectralType)) {
            return stars.get(spectralType);
        } else {
            Star star = new Star().setSpectralType(spectralType);
            stars.put(spectralType, star);
            return star;
        }
    }
}
