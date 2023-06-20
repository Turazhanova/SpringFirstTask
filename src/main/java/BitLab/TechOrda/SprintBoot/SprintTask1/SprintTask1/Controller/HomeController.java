package BitLab.TechOrda.SprintBoot.SprintTask1.SprintTask1.Controller;

import BitLab.TechOrda.SprintBoot.SprintTask1.SprintTask1.db.DBManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;

@Controller
public class HomeController {


    @GetMapping(value = "/home")
    public String indexPage(Model model){
        ArrayList<Student> students = DBManager.getStudents();
        model.addAttribute("students", students);
        return "index";
    }

    @GetMapping(value = "/add-student")// how adress 
    public String StudentPage(){
        return "add-student";
    }

    @PostMapping(value = "/addStudent")
    public String addStudent(Student student){
        DBManager.addStudent(student);
        return "redirect:/home";
    }
}
