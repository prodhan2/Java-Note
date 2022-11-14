import java.util.HashMap;

public class Hash_map {
    public static void main(String[] args) {
        HashMap<String ,String> CountryCity = new HashMap<String,String>();
        CountryCity.put("ENGLIND" , "LONDON");
        CountryCity.put("Norway", "Oslo");
        CountryCity.put("USA", "Washington DC");
        CountryCity.put("BanGLADESH", "DHAKA");
//        System.out.println(CountryCity.get("BanGLADESH"));    search capital city
//         CountryCity.clear();
//        System.out.println( CountryCity.size());
//        for(String i : CountryCity.keySet())                //country
//        {
//            System.out.println(i);
//        }
//        for(String i : CountryCity.values())
//        {                                      //capital
//            System.out.println(i);
//        }

        //Country and City both print......

        for(String i : CountryCity.keySet())
        {
            System.out.println("COUNTRY= "+i+ "    CITY  "+ CountryCity.get(i));
        }

          System.out.println(CountryCity);


    }
}


