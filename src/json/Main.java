package json;

public class Main {
    public static void main(String[] args) {

        /*
        This takes the information from the dog owner and converts that info into a JSON string

         */
        Dog json = new Dog();
        json.getInfo();
        String jsonString = JSONExample.objectToJSON(json);
        System.out.print(jsonString);

    /*
    This example takes the JSON string and converts it into a json object string
     */
        Dog dog2 = JSONExample.JSONToObject(jsonString);
        dog2.displayInfo();
    }

}
