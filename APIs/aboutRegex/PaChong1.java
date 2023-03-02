package APIs.aboutRegex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PaChong1 {
    public static void main(String[] args) throws IOException {

        URL url = new URL("https://www.baidu.com");

        URLConnection connection = url.openConnection();

        BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String line;

        String regex = "\\w+";
        Pattern pattern = Pattern.compile(regex);

        while ((line = br.readLine()) != null){
            Matcher matcher = pattern.matcher(line);
            if (matcher.find()){
                String str = matcher.group();
                System.out.println(str);
            }
        }
    }
}
