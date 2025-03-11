package cn.bugstack.chatbot.api.test;

import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

import java.io.IOException;

/**
 * @author pl
 */
public class ApiTest {
    @Test
    public  void query_unanswered_questrions() throws IOException {
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
        HttpGet get = new HttpGet("https://api.zsxq.com/v2/groups/48885441811818/topics?scope=unanswered_questions&count=20");
        get.addHeader("cookie","zsxqsessionid=c04921da284f655b0b8416bec82e49e4; abtest_env=product; tfstk=gv_ZgkVVPPUaPFbanBYqYayAXcY9lF2S_Z9XisfD1dvi5qsUmsfM1n295ZWFp9B11s_Vvq5RMNN9l5LO6EL0F8a531C9kw_RnNbZKDAAtcDDskThaQSeu8a7P1czobA4FNTLjc96iEAMIcm3TIOyiExMnDVeiIMimVXctWJpGcmMoEAH-IODoKXDoW5HpIDXpKvS8Q-ggXba764E2hplspumzXdyj2fZc4gSoCx6EHvEoC7e_hJl_NTKOcOhRw-WAjZJ-_ICIB8zRcYlTiXPqtESvF5cjtKFBJnedMbOiKxIi45Fa1jk-ZNmwHWHg3YDYj0cTFph3NTurvRdx1scWOlqoCQ1PnJJYS0vcebWqgXZM7CHSIXv2Zw-WdfcwaIWzyiMr6ScUiSytxdn9l7Abxm2jBdeFWPFm-PObm1Z2SnxDhIpTLNT6mnvjBdeFWPEDmK9yBJ765C..; zsxq_access_token=9E1793CD-7965-4AF0-9CFC-D6361B95CC28_D15044DB0A8AEFDF; sensorsdata2015jssdkcross=%7B%22distinct_id%22%3A%22584255221285514%22%2C%22first_id%22%3A%221958020e619fce-095b9586c70a77-26011a51-1327104-1958020e61a12b1%22%2C%22props%22%3A%7B%22%24latest_traffic_source_type%22%3A%22%E7%9B%B4%E6%8E%A5%E6%B5%81%E9%87%8F%22%2C%22%24latest_search_keyword%22%3A%22%E6%9C%AA%E5%8F%96%E5%88%B0%E5%80%BC_%E7%9B%B4%E6%8E%A5%E6%89%93%E5%BC%80%22%2C%22%24latest_referrer%22%3A%22%22%7D%2C%22identities%22%3A%22eyIkaWRlbnRpdHlfY29va2llX2lkIjoiMTk1ODAyMGU2MTlmY2UtMDk1Yjk1ODZjNzBhNzctMjYwMTFhNTEtMTMyNzEwNC0xOTU4MDIwZTYxYTEyYjEiLCIkaWRlbnRpdHlfbG9naW5faWQiOiI1ODQyNTUyMjEyODU1MTQifQ%3D%3D%22%2C%22history_login_id%22%3A%7B%22name%22%3A%22%24identity_login_id%22%2C%22value%22%3A%22584255221285514%22%7D%2C%22%24device_id%22%3A%221958020e619fce-095b9586c70a77-26011a51-1327104-1958020e61a12b1%22%7D");
        get.addHeader("Content-Type","application/json, text/plain, */*");
        CloseableHttpResponse response = httpClient.execute(get);
        if(response.getStatusLine().getStatusCode() == HttpStatus.SC_OK){
            String res = EntityUtils.toString(response.getEntity());
            System.out.println(res);
        }else{
            System.out.println(response.getStatusLine().getStatusCode());
        }
    }
    @Test
    public void answer() throws IOException {
        CloseableHttpClient httpClient = HttpClientBuilder.create().build();
        HttpPost post = new HttpPost("https://api.zsxq.com/v2/topics/2858118528455821/answer");
        post.addHeader("cookie","zsxqsessionid=c04921da284f655b0b8416bec82e49e4; abtest_env=product; tfstk=gv_ZgkVVPPUaPFbanBYqYayAXcY9lF2S_Z9XisfD1dvi5qsUmsfM1n295ZWFp9B11s_Vvq5RMNN9l5LO6EL0F8a531C9kw_RnNbZKDAAtcDDskThaQSeu8a7P1czobA4FNTLjc96iEAMIcm3TIOyiExMnDVeiIMimVXctWJpGcmMoEAH-IODoKXDoW5HpIDXpKvS8Q-ggXba764E2hplspumzXdyj2fZc4gSoCx6EHvEoC7e_hJl_NTKOcOhRw-WAjZJ-_ICIB8zRcYlTiXPqtESvF5cjtKFBJnedMbOiKxIi45Fa1jk-ZNmwHWHg3YDYj0cTFph3NTurvRdx1scWOlqoCQ1PnJJYS0vcebWqgXZM7CHSIXv2Zw-WdfcwaIWzyiMr6ScUiSytxdn9l7Abxm2jBdeFWPFm-PObm1Z2SnxDhIpTLNT6mnvjBdeFWPEDmK9yBJ765C..; zsxq_access_token=9E1793CD-7965-4AF0-9CFC-D6361B95CC28_D15044DB0A8AEFDF; sensorsdata2015jssdkcross=%7B%22distinct_id%22%3A%22584255221285514%22%2C%22first_id%22%3A%221958020e619fce-095b9586c70a77-26011a51-1327104-1958020e61a12b1%22%2C%22props%22%3A%7B%22%24latest_traffic_source_type%22%3A%22%E7%9B%B4%E6%8E%A5%E6%B5%81%E9%87%8F%22%2C%22%24latest_search_keyword%22%3A%22%E6%9C%AA%E5%8F%96%E5%88%B0%E5%80%BC_%E7%9B%B4%E6%8E%A5%E6%89%93%E5%BC%80%22%2C%22%24latest_referrer%22%3A%22%22%7D%2C%22identities%22%3A%22eyIkaWRlbnRpdHlfY29va2llX2lkIjoiMTk1ODAyMGU2MTlmY2UtMDk1Yjk1ODZjNzBhNzctMjYwMTFhNTEtMTMyNzEwNC0xOTU4MDIwZTYxYTEyYjEiLCIkaWRlbnRpdHlfbG9naW5faWQiOiI1ODQyNTUyMjEyODU1MTQifQ%3D%3D%22%2C%22history_login_id%22%3A%7B%22name%22%3A%22%24identity_login_id%22%2C%22value%22%3A%22584255221285514%22%7D%2C%22%24device_id%22%3A%221958020e619fce-095b9586c70a77-26011a51-1327104-1958020e61a12b1%22%7D");
        post.addHeader("Content-Type","application/json, text/plain, */*");

        String paramJson = "{\n" +
                "  \"req_data\": {\n" +
                "    \"text\": \"hhh\\n\",\n" +
                "    \"image_ids\": [],\n" +
                "    \"silenced\": false\n" +
                "  }\n" +
                "}";
        StringEntity stringEntity = new StringEntity(paramJson, ContentType.create("text/json", "UTF-8"));

        post.setEntity(stringEntity);
        CloseableHttpResponse response = httpClient.execute(post);

        if(response.getStatusLine().getStatusCode() == HttpStatus.SC_OK){
            String res = EntityUtils.toString(response.getEntity());
            System.out.println(res);
        }else{
            System.out.println(response.getStatusLine().getStatusCode());
        }
    }
}
