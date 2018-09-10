import com.places.kamilb.models.PlaceModel;
import com.places.kamilb.models.services.PlaceService;
import org.junit.Assert.*;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class TestPlaces {

    @Test
    public void testExists() {
        PlaceService placeService = new PlaceService();
        List<PlaceModel> placeModelList = new ArrayList<>();

        placeService.getPlacesInfo("123", "321");

        assertEquals("Should return blank list",
                placeModelList,
                placeService.getPlacesInfo("123", "321"));

    }
}
