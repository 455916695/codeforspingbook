package HtmlTest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HtmlTest {

    @RequestMapping("/test/htmlTest")
    @ResponseBody
    public String htmlTest() {
        return "HelloWorld";
    }


}
