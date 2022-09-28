package WebEx1.WebEx1.contoller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServlet;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/all")
public class myController  {

    @RequestMapping("/view")
    @ResponseBody
    @ResponseStatus(HttpStatus.OK)
    public String ping()
    {
        return "success. returned";
    }

    @RequestMapping( value = "/read", method = RequestMethod.POST)
    @ResponseBody()
    @ResponseStatus(HttpStatus.OK)
    public List<String> Read(@RequestParam(value  = "name", defaultValue = "defaultname") String name,
                            @RequestParam(value = "password", defaultValue = "defultpassword") String password)
            {
        List<String> l = new ArrayList<>();
        l.add("usename is: " + name);
        l.add("password is: " + password);
        return l;
    }
}
