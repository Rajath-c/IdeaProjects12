package org.example;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;

public class Main {

    public static void main(String[] args) throws UnirestException {


        // This code sample uses the  'Unirest' library:
// http://unirest.io/java.html
        HttpResponse<JsonNode> response = Unirest.get("https://chittirajath.atlassian.net/rest/api/3/project/search")
                .basicAuth("chittirajath@gmail.com", "ATATT3xFfGF0cO2R-9bSFHjKvqr-5z8sqz7esI_ITIPCnpkfJ9pAhHdBN5QV9mDhDAlPGRDbl2-VRbXeq2O7albBuvng72ICsSCVM3K09FiNiGPPRdX5yuXrnDS5hhbp2nR3vkQSln2ySE3kbuDIGewoMh8W-lo2OT-zubwB1iR-_NlxnYVU-6M=560733CC")
                .header("Accept", "application/json")
                .asJson();


        System.out.println(response.getBody());
    }


}