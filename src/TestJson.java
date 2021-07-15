import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class TestJson {
    public static void main(String[] args) {
        String json = "{\n" +
                "\t\"notFoundIds\": null,\n" +
                "\t\"items\": [\n" +
                "\t\t{\n" +
                "\t\t\t\"id\": \"Y2lzY29zcGFyazovL3VzL1BFT1BMRS8xOGViMWUyNS1kMDJhLTRjZDItOWNmZS00NDQwMGQ2Y2QyNjk\",\n" +
                "\t\t\t\"emails\": [\n" +
                "\t\t\t\t\"drsoft.smp@gmail.com\"\n" +
                "\t\t\t],\n" +
                "\t\t\t\"sipAddresses\": [\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"type\": \"personal-room\",\n" +
                "\t\t\t\t\t\"value\": \"pr1580980445@meet115.webex.com\",\n" +
                "\t\t\t\t\t\"primary\": false\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"type\": \"personal-room\",\n" +
                "\t\t\t\t\t\"value\": \"1580980445@doctorsoft.my.webex.com\",\n" +
                "\t\t\t\t\t\"primary\": false\n" +
                "\t\t\t\t},\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"type\": \"personal-room\",\n" +
                "\t\t\t\t\t\"value\": \"drsoft.smp@doctorsoft.my.webex.com\",\n" +
                "\t\t\t\t\t\"primary\": false\n" +
                "\t\t\t\t}\n" +
                "\t\t\t],\n" +
                "\t\t\t\"displayName\": \"DOCTORSOFT Co.LTD\",\n" +
                "\t\t\t\"nickName\": \"DOCTORSOFT\",\n" +
                "\t\t\t\"firstName\": \"DOCTORSOFT\",\n" +
                "\t\t\t\"lastName\": \"Co.LTD\",\n" +
                "\t\t\t\"orgId\": \"Y2lzY29zcGFyazovL3VzL09SR0FOSVpBVElPTi8yODJkYWEzNC04YjNmLTRlN2ItYTU0YS1hYTk3ODIxOTZiOTM\",\n" +
                "\t\t\t\"roles\": [\n" +
                "\t\t\t\t\"Y2lzY29zcGFyazovL3VzL1JPTEUvaWRfZnVsbF9hZG1pbg\"\n" +
                "\t\t\t],\n" +
                "\t\t\t\"licenses\": [\n" +
                "\t\t\t\t\"Y2lzY29zcGFyazovL3VzL0xJQ0VOU0UvMjgyZGFhMzQtOGIzZi00ZTdiLWE1NGEtYWE5NzgyMTk2YjkzOkZTU18xYjcyOGZmOS03ZGU4LTRjYjctOTU0MC0yOTMyMGI1YTQyY2I\",\n" +
                "\t\t\t\t\"Y2lzY29zcGFyazovL3VzL0xJQ0VOU0UvMjgyZGFhMzQtOGIzZi00ZTdiLWE1NGEtYWE5NzgyMTk2YjkzOkNGXzQyMmFlY2UxLTQ2OTgtNDNjMy1hZjhkLThjZTc3NWFkMWU2NQ\",\n" +
                "\t\t\t\t\"Y2lzY29zcGFyazovL3VzL0xJQ0VOU0UvMjgyZGFhMzQtOGIzZi00ZTdiLWE1NGEtYWE5NzgyMTk2YjkzOk1DXzIyYzFmNzlkLWU2NTctNDJhYi04YzRmLWUxNWU4ZjU2OWMzNl9kb2N0b3Jzb2Z0Lm15LndlYmV4LmNvbQ\",\n" +
                "\t\t\t\t\"Y2lzY29zcGFyazovL3VzL0xJQ0VOU0UvMjgyZGFhMzQtOGIzZi00ZTdiLWE1NGEtYWE5NzgyMTk2YjkzOk1TXzg5NjlmZjgyLTBmY2ItNDAyYi04ZDI0LWRjMDMxNjliMGU4MA\",\n" +
                "\t\t\t\t\"Y2lzY29zcGFyazovL3VzL0xJQ0VOU0UvMjgyZGFhMzQtOGIzZi00ZTdiLWE1NGEtYWE5NzgyMTk2YjkzOkZUTV9mNWZkZTM1Zi00NzA0LTQ2MGEtODEwZi00YzVkMzUyNDFlNjk\",\n" +
                "\t\t\t\t\"Y2lzY29zcGFyazovL3VzL0xJQ0VOU0UvMjgyZGFhMzQtOGIzZi00ZTdiLWE1NGEtYWE5NzgyMTk2YjkzOkZUQ19hMjQ3MzgyOC1hOTgwLTQ3MmYtODE5ZC02YjljY2UwOGU5MmI\",\n" +
                "\t\t\t\t\"Y2lzY29zcGFyazovL3VzL0xJQ0VOU0UvMjgyZGFhMzQtOGIzZi00ZTdiLWE1NGEtYWE5NzgyMTk2YjkzOldBTV8yZDM4ODZlMy02YWNkLTQyMTYtOTE0MS1hOGZlOTAxMzRlMzY\",\n" +
                "\t\t\t\t\"Y2lzY29zcGFyazovL3VzL0xJQ0VOU0UvMjgyZGFhMzQtOGIzZi00ZTdiLWE1NGEtYWE5NzgyMTk2YjkzOkZNU185ZWNhNzgxNC0zMzEzLTQ2NGYtOTY0Mi0wMjM5ODc1YmM5Zjg\"\n" +
                "\t\t\t],\n" +
                "\t\t\t\"created\": \"2021-06-25T00:31:08.025Z\",\n" +
                "\t\t\t\"lastModified\": \"2021-07-07T04:51:09.019Z\",\n" +
                "\t\t\t\"timeZone\": \"Asia/Seoul\",\n" +
                "\t\t\t\"lastActivity\": \"2021-07-12T00:05:22.234Z\",\n" +
                "\t\t\t\"status\": \"active\",\n" +
                "\t\t\t\"invitePending\": false,\n" +
                "\t\t\t\"loginEnabled\": true,\n" +
                "\t\t\t\"type\": \"person\",\n" +
                "\t\t\t\"siteUrls\": [\n" +
                "\t\t\t\t\"doctorsoft.my.webex.com\"\n" +
                "\t\t\t]\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"id\": \"Y2lzY29zcGFyazovL3VzL1BFT1BMRS83YWM4NzU0OS00OTgxLTRiNTUtYjM5Yi0xOWMzMmQ4NmEwMDA\",\n" +
                "\t\t\t\"emails\": [\n" +
                "\t\t\t\t\"imgeun@doctorsoft.co.kr\"\n" +
                "\t\t\t],\n" +
                "\t\t\t\"displayName\": \"신임근\",\n" +
                "\t\t\t\"nickName\": \"imgeun\",\n" +
                "\t\t\t\"firstName\": \"imgeun\",\n" +
                "\t\t\t\"lastName\": \"imgeun\",\n" +
                "\t\t\t\"orgId\": \"Y2lzY29zcGFyazovL3VzL09SR0FOSVpBVElPTi8yODJkYWEzNC04YjNmLTRlN2ItYTU0YS1hYTk3ODIxOTZiOTM\",\n" +
                "\t\t\t\"roles\": [],\n" +
                "\t\t\t\"licenses\": [\n" +
                "\t\t\t\t\"Y2lzY29zcGFyazovL3VzL0xJQ0VOU0UvMjgyZGFhMzQtOGIzZi00ZTdiLWE1NGEtYWE5NzgyMTk2YjkzOkZTU18xYjcyOGZmOS03ZGU4LTRjYjctOTU0MC0yOTMyMGI1YTQyY2I\",\n" +
                "\t\t\t\t\"Y2lzY29zcGFyazovL3VzL0xJQ0VOU0UvMjgyZGFhMzQtOGIzZi00ZTdiLWE1NGEtYWE5NzgyMTk2YjkzOkZUTV9mNWZkZTM1Zi00NzA0LTQ2MGEtODEwZi00YzVkMzUyNDFlNjk\",\n" +
                "\t\t\t\t\"Y2lzY29zcGFyazovL3VzL0xJQ0VOU0UvMjgyZGFhMzQtOGIzZi00ZTdiLWE1NGEtYWE5NzgyMTk2YjkzOkZNU185ZWNhNzgxNC0zMzEzLTQ2NGYtOTY0Mi0wMjM5ODc1YmM5Zjg\",\n" +
                "\t\t\t\t\"Y2lzY29zcGFyazovL3VzL0xJQ0VOU0UvMjgyZGFhMzQtOGIzZi00ZTdiLWE1NGEtYWE5NzgyMTk2YjkzOkZUQ19hMjQ3MzgyOC1hOTgwLTQ3MmYtODE5ZC02YjljY2UwOGU5MmI\"\n" +
                "\t\t\t],\n" +
                "\t\t\t\"created\": \"2021-07-02T00:32:27.392Z\",\n" +
                "\t\t\t\"lastModified\": \"2021-07-02T00:42:13.425Z\",\n" +
                "\t\t\t\"lastActivity\": \"2021-07-02T00:42:23.077Z\",\n" +
                "\t\t\t\"status\": \"inactive\",\n" +
                "\t\t\t\"invitePending\": false,\n" +
                "\t\t\t\"loginEnabled\": true,\n" +
                "\t\t\t\"type\": \"person\"\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"id\": \"Y2lzY29zcGFyazovL3VzL1BFT1BMRS8wZTJkMDRhMy01NTYxLTQ5NzAtOGI2MS1hYjkzOGViMDA5YmU\",\n" +
                "\t\t\t\"emails\": [\n" +
                "\t\t\t\t\"tghui92@doctorsoft.co.kr\"\n" +
                "\t\t\t],\n" +
                "\t\t\t\"displayName\": \"Taegyu HO\",\n" +
                "\t\t\t\"nickName\": \"tghui92\",\n" +
                "\t\t\t\"firstName\": \"tghui92\",\n" +
                "\t\t\t\"lastName\": \"tghui92\",\n" +
                "\t\t\t\"orgId\": \"Y2lzY29zcGFyazovL3VzL09SR0FOSVpBVElPTi8yODJkYWEzNC04YjNmLTRlN2ItYTU0YS1hYTk3ODIxOTZiOTM\",\n" +
                "\t\t\t\"roles\": [],\n" +
                "\t\t\t\"licenses\": [\n" +
                "\t\t\t\t\"Y2lzY29zcGFyazovL3VzL0xJQ0VOU0UvMjgyZGFhMzQtOGIzZi00ZTdiLWE1NGEtYWE5NzgyMTk2YjkzOkZTU18xYjcyOGZmOS03ZGU4LTRjYjctOTU0MC0yOTMyMGI1YTQyY2I\",\n" +
                "\t\t\t\t\"Y2lzY29zcGFyazovL3VzL0xJQ0VOU0UvMjgyZGFhMzQtOGIzZi00ZTdiLWE1NGEtYWE5NzgyMTk2YjkzOkZUTV9mNWZkZTM1Zi00NzA0LTQ2MGEtODEwZi00YzVkMzUyNDFlNjk\",\n" +
                "\t\t\t\t\"Y2lzY29zcGFyazovL3VzL0xJQ0VOU0UvMjgyZGFhMzQtOGIzZi00ZTdiLWE1NGEtYWE5NzgyMTk2YjkzOkZNU185ZWNhNzgxNC0zMzEzLTQ2NGYtOTY0Mi0wMjM5ODc1YmM5Zjg\",\n" +
                "\t\t\t\t\"Y2lzY29zcGFyazovL3VzL0xJQ0VOU0UvMjgyZGFhMzQtOGIzZi00ZTdiLWE1NGEtYWE5NzgyMTk2YjkzOkZUQ19hMjQ3MzgyOC1hOTgwLTQ3MmYtODE5ZC02YjljY2UwOGU5MmI\"\n" +
                "\t\t\t],\n" +
                "\t\t\t\"created\": \"2021-07-02T05:10:37.279Z\",\n" +
                "\t\t\t\"lastModified\": \"2021-07-07T03:57:46.883Z\",\n" +
                "\t\t\t\"lastActivity\": \"2021-07-05T04:20:42.419Z\",\n" +
                "\t\t\t\"status\": \"inactive\",\n" +
                "\t\t\t\"invitePending\": false,\n" +
                "\t\t\t\"loginEnabled\": true,\n" +
                "\t\t\t\"type\": \"person\"\n" +
                "\t\t},\n" +
                "\t\t{\n" +
                "\t\t\t\"id\": \"Y2lzY29zcGFyazovL3VzL1BFT1BMRS9jOGM5YTY1OS1mYjhkLTRiNjUtYTgzNi0yOTI5YjgxMDdlNGQ\",\n" +
                "\t\t\t\"emails\": [\n" +
                "\t\t\t\t\"tisso010@naver.com\"\n" +
                "\t\t\t],\n" +
                "\t\t\t\"sipAddresses\": [\n" +
                "\t\t\t\t{\n" +
                "\t\t\t\t\t\"type\": \"personal-room\",\n" +
                "\t\t\t\t\t\"value\": \"tisso010@doctorsoft.my.webex.com\",\n" +
                "\t\t\t\t\t\"primary\": false\n" +
                "\t\t\t\t}\n" +
                "\t\t\t],\n" +
                "\t\t\t\"displayName\": \"leee\",\n" +
                "\t\t\t\"nickName\": \"tisso010\",\n" +
                "\t\t\t\"firstName\": \"tisso010\",\n" +
                "\t\t\t\"lastName\": \"tisso010\",\n" +
                "\t\t\t\"orgId\": \"Y2lzY29zcGFyazovL3VzL09SR0FOSVpBVElPTi8yODJkYWEzNC04YjNmLTRlN2ItYTU0YS1hYTk3ODIxOTZiOTM\",\n" +
                "\t\t\t\"roles\": [\n" +
                "\t\t\t\t\"Y2lzY29zcGFyazovL3VzL1JPTEUvaWRfZnVsbF9hZG1pbg\"\n" +
                "\t\t\t],\n" +
                "\t\t\t\"licenses\": [\n" +
                "\t\t\t\t\"Y2lzY29zcGFyazovL3VzL0xJQ0VOU0UvMjgyZGFhMzQtOGIzZi00ZTdiLWE1NGEtYWE5NzgyMTk2YjkzOkZTU18xYjcyOGZmOS03ZGU4LTRjYjctOTU0MC0yOTMyMGI1YTQyY2I\",\n" +
                "\t\t\t\t\"Y2lzY29zcGFyazovL3VzL0xJQ0VOU0UvMjgyZGFhMzQtOGIzZi00ZTdiLWE1NGEtYWE5NzgyMTk2YjkzOkZUTV9mNWZkZTM1Zi00NzA0LTQ2MGEtODEwZi00YzVkMzUyNDFlNjk\",\n" +
                "\t\t\t\t\"Y2lzY29zcGFyazovL3VzL0xJQ0VOU0UvMjgyZGFhMzQtOGIzZi00ZTdiLWE1NGEtYWE5NzgyMTk2YjkzOkZNU185ZWNhNzgxNC0zMzEzLTQ2NGYtOTY0Mi0wMjM5ODc1YmM5Zjg\",\n" +
                "\t\t\t\t\"Y2lzY29zcGFyazovL3VzL0xJQ0VOU0UvMjgyZGFhMzQtOGIzZi00ZTdiLWE1NGEtYWE5NzgyMTk2YjkzOkZUQ19hMjQ3MzgyOC1hOTgwLTQ3MmYtODE5ZC02YjljY2UwOGU5MmI\"\n" +
                "\t\t\t],\n" +
                "\t\t\t\"created\": \"2021-07-02T04:39:23.442Z\",\n" +
                "\t\t\t\"lastModified\": \"2021-07-10T13:20:29.400Z\",\n" +
                "\t\t\t\"lastActivity\": \"2021-07-05T23:57:58.907Z\",\n" +
                "\t\t\t\"status\": \"inactive\",\n" +
                "\t\t\t\"invitePending\": false,\n" +
                "\t\t\t\"loginEnabled\": true,\n" +
                "\t\t\t\"type\": \"person\",\n" +
                "\t\t\t\"siteUrls\": [\n" +
                "\t\t\t\t\"doctorsoft.my.webex.com\"\n" +
                "\t\t\t]\n" +
                "\t\t}\n" +
                "\t]\n" +
                "}";

        JSONArray jsonItem = stringTransJson(json);

        List<String> list = new ArrayList<>();
        ArrayList<String> starr = new ArrayList<>();
        for (int i = 0; i < jsonItem.toList().size(); i++) {

            JSONObject object = jsonItem.getJSONObject(i);
            for (int j = 0; j < object.getJSONArray("licenses").length(); j++) {
                starr.add((String) object.getJSONArray("licenses").get(j));
            }
            starr.add("\n");
            System.out.println(object.getJSONArray("licenses").length());
            //라이선스가 8개면 유료 4개면 무료 갯수로 판단하는게 빠름
        }
        starr.forEach(arr -> System.out.println(arr));

    }

    public static JSONArray stringTransJson(String json) {
        String name = "stringTransJson";

        String jsonStr = json;

        JSONObject jsonObj = new JSONObject(jsonStr);
        JSONArray jsonItem = (JSONArray) jsonObj.get("items");

        return jsonItem;
    }

}
