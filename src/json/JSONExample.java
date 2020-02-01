package json;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.io.IOException;

public class JSONExample {
/*
   1. objectTOJSON uses the user input of the dog object
   2. than processes the data from the user into a Json string
   3. Object mapper is used to parse the object and place into a json string.

 */
    public static String objectToJSON(Dog mydog) {

        ObjectMapper mapper = new ObjectMapper();
        String d = "";

        try {
            d = mapper.writeValueAsString(mydog);
        } catch (JsonProcessingException e) {
            System.err.println(e.toString());
        }

        return d;
    }
    /*
    1. the object mapper takes the json string and makes an object
    2. using the json string turning into a java object and readable for user
     */

    public static Dog JSONToObject(String d) {

        ObjectMapper mapper = new ObjectMapper();
        Dog dog = null;

        try {
            dog = mapper.readValue(d, Dog.class);
        } catch (JsonProcessingException e) {
            System.err.println(e.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return dog;
    }

}


