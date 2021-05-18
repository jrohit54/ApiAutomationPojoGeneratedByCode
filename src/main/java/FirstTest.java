import com.google.gson.Gson;
import com.pojogenerated.Accession;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;


public class FirstTest {


@Test
    public void firstTest()
{
    RequestSpecification given = RestAssured.given();
    Response response = given.baseUri("https://reqres.in").basePath("/api/users?delay=1")
            .get();


    Gson gson=new Gson();
    Accession accession = gson.fromJson(response.asString(), Accession.class);
    System.out.println(accession.getPage());
    System.out.println(accession.getPerPage());
    System.out.println( accession.getData().get(0).getEmail());

}







}
