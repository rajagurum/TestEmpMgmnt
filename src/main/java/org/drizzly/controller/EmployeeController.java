package org.drizzly.controller;

import org.springframework.web.servlet.ModelAndView;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.util.Map;
import org.drizzly.core.EmployeeManager;
import org.drizzly.interfaces.dto.IEmployee;
import org.drizzly.persistence.dto.DrMaEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EmployeeController {

    protected final Log logger = LogFactory.getLog(getClass());
    @Autowired
    EmployeeManager manager;

    @InitBinder
    public void initBinder(WebDataBinder binder) {
       // SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        //dateFormat.setLenient(false);
        //binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }

    @RequestMapping(value = "/deleteEmployee.html" , method = RequestMethod.GET)
    public ModelAndView deleteEmployee(@RequestParam Map<String,String> reqParam){
        ModelAndView modelAndView = new ModelAndView("EmployeeDetails");
        System.out.println("emp Id "+reqParam.get("employeeId"));
        logger.debug(reqParam.get("employeeId"));
        final Long empId = Long.valueOf(reqParam.get("employeeId"));
        manager.removeEmployee(empId);
        modelAndView.addObject("message","Ressign Updted for the Employee id is "+empId);
        return modelAndView;
    }
    
    @RequestMapping(value = "/updateEmployee.html" , method = RequestMethod.GET)
    public ModelAndView updateEmployee(@ModelAttribute("employee") DrMaEmployee employee){
        System.out.println("employee "+employee.getEmName());
        ModelAndView modelAndView = new ModelAndView("EmployeeDetails");
        modelAndView.addObject("insertMessage", "Record Inserted");
        System.out.println("Employee input details "+employee);
        manager.UpdateEmployee(employee);
        return modelAndView;
    }
    
    @ModelAttribute
    public void addCommonObjects(Model model){
        model.addAttribute("drizzlyheader", "Drizzly Employees");
    }
    
    @RequestMapping(value="/findAction.html", method=RequestMethod.POST)
    public ModelAndView handlePost(@RequestParam Map<String,String> reqParam){
        ModelAndView modelAndView = new ModelAndView();
        if( reqParam.get("doAction").equals("findEmployee") ){
            modelAndView =  new ModelAndView("redirect:/findEmployee.html");
        }
        else if(  reqParam.get("doAction").equals("deleteEmployee") ){
            modelAndView =  new ModelAndView("redirect:/deleteEmployee.html");
        }
        else if(  reqParam.get("doAction").equals("updateEmployee") ){
            modelAndView =  new ModelAndView("redirect:/updateEmployee.html");
        }
        else if(  reqParam.get("doAction").equals("findAnotherEmployee") ){
            modelAndView =  new ModelAndView("redirect:/findEmployeeForm.html");
        }
         modelAndView.addAllObjects(reqParam);
        return modelAndView;
    }
    
    @RequestMapping(value ="/findEmployeeForm.html" , method = RequestMethod.GET)
    public ModelAndView findEmployeeForm(){
        ModelAndView modelAndView = new ModelAndView("EmployeeForm");
        return modelAndView;
    }

    @RequestMapping(value = "/findEmployee.html" , method = RequestMethod.GET)
    public ModelAndView findEmployee(@RequestParam Map<String,String> reqParam){
        ModelAndView modelAndView = new ModelAndView("EmployeeDetails");
        //Employee employee = new Employee();
        System.out.println("doAction  "+reqParam.get("doAction"));
        logger.debug(reqParam.get("doAction"));
        System.out.println("emp Id "+reqParam.get("employeeId"));
        logger.debug(reqParam.get("employeeId"));
        final Long empId = Long.valueOf(reqParam.get("employeeId"));
        IEmployee iEmployee = manager.getEmployeeDetails(empId);
        modelAndView.addObject("employee",iEmployee);
        return modelAndView;
    }
    
    @RequestMapping(value ="/insertEmployeeForm.html" , method = RequestMethod.GET)
    public ModelAndView insertEmployeeForm(){
        ModelAndView modelAndView = new ModelAndView("AddEmployee");
        return modelAndView;
    }
    
    @RequestMapping(value = "/insertEmployee.html" , method = RequestMethod.POST)
    public ModelAndView insertEmployee(@ModelAttribute("employee") DrMaEmployee employee){
        System.out.println("employee "+employee.getEmName());
        ModelAndView modelAndView = new ModelAndView("EmployeeDetails");
        modelAndView.addObject("insertMessage", "Record Inserted");
        System.out.println("Employee input details "+employee);
        manager.saveEmployee(employee);
        return modelAndView;
    }
}  
       
