package Controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;

@ManagedBean(name="click")
@SessionScoped
public class Controller implements Serializable{
    public String clickMeButton() {
        return "index";
    }
}
