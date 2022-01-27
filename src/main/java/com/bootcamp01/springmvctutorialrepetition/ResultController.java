package com.bootcamp01.springmvctutorialrepetition;
import java.util.*;

//****************bu class hep result.jsp e atif yapiyor*********************************
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import antlr.collections.List;

@Controller
public class ResultController {

	// 1.way
//	@RequestMapping("add") //the parameter should be the same as the action in the form
//	public String addNums1(HttpServletRequest req ) {
//		
//		int a = Integer.parseInt(req.getParameter("n1"));
//		int b = Integer.parseInt(req.getParameter("n2"));
//		int sum = a+b;
//		int product = a*b;
//		HttpSession session = req.getSession();
//		session.setAttribute("sumOfTwoIntegers", sum);
//		session.setAttribute("productOfTwoIntegers", product);
//		return "result";
//	}
	
	//2.way
//	@RequestMapping("add")
//	public String addNums2(@RequestParam("n1") int a, @RequestParam("n2") int b, HttpSession session) {
//		
//		int sum = a+b;
//     	int product = a*b;
//     	session.setAttribute("sumOfTwoIntegers", sum);
// 		session.setAttribute("productOfTwoIntegers", product);
// 		
// 		return "result";
//	}
	
	//3. way ==>1st way of using ModelAndView
//	@RequestMapping("add")
//	public ModelAndView addNums3(@RequestParam("n1") int a, @RequestParam("n2") int b) {
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("result");
//		int sum = a+b;
//     	int product = a*b;
//     	mv.addObject("sumOfTwoIntegers", sum);
// 		mv.addObject("productOfTwoIntegers", product);
// 		
// 		return mv;
//	}
	
	//4. way==>2nd way of using ModelAndView
//		@RequestMapping("add")
//		public ModelAndView addNums4(@RequestParam("n1") int a, @RequestParam("n2") int b) {
//			ModelAndView mv = new ModelAndView("result");
//			int sum = a+b;
//	     	int product = a*b;
//	     	mv.addObject("sumOfTwoIntegers", sum);
//	 		mv.addObject("productOfTwoIntegers", product);
//	 		
//	 		return mv;
//		}
	
	//5. way ==> Showing the usage of Model interface
//	@RequestMapping("add")
//	public String addNums5(@RequestParam("n1") int a, @RequestParam("n2") int b, Model m) {
//		
//		int sum = a+b;
//     	int product = a*b;
//     	m.addAttribute("sumOfTwoIntegers", sum).addAttribute("productOfTwoIntegers", product);
// 	  //m.addAttribute("productOfTwoIntegers", product);
// 		
// 		return "result";
//	}
	
	//6. way 
//	@RequestMapping("add")
//	public String addNums6(@RequestParam("n1") int a, @RequestParam("n2") int b, ModelMap mm) {
//		
//		int sum = a+b;
//     	int product = a*b;
//     	mm.addAttribute("sumOfTwoIntegers", sum).addAttribute("productOfTwoIntegers", product);
// 	  //m.addAttribute("productOfTwoIntegers", product);
// 		
// 		return "result";
//	}
	
	
	//**************************************************************************************************
	
	//Student method:
	
	//1.way
//	@RequestMapping("addStudent")
//	public String addStudent1(@RequestParam("id") int id, @RequestParam("name") String name, Model m) {
		//1st way of object creation with constructor without parameters
//		Student student = new Student();
//		student.setId(id);
//		student.setName(name);
		
		//2nd way of object creation
//		Student student = new Student(id,name);
//		m.addAttribute("studentObject", student);
//		
//		return "result";

//	}
//	@RequestMapping("addStudent")
//	public String addStudent2(@ModelAttribute Student student, Model m) {
//		m.addAttribute("studentObject", student);
//		return "result";
//	}
	
//	@RequestMapping("addStudent")
//	public String addStudent3(@ModelAttribute("studentObject") Student student) {
//		
//		return "result";
//	}	
//	
//	
//	//How to get a specific field from the object
//	@ModelAttribute
//	public void greetStudent(Model m, Student student) {
//		m.addAttribute("greetStudent",student.getName());
//	}
	
	/*How to use post method
	//1st Way
	
	 1)inside the method paranthesis type method=RequestMethod.POST
	 2)then go to index.jsp file and add method="post" inside theform tag
	 */
	
	
//	@RequestMapping(value = "addStudent" , method= RequestMethod.POST)
//	public String addStudent4 (@ModelAttribute("studentObject") Student student )
//	{
//		
//		return "result";
//	}
//	
//	//How to get a specific field from the object, you need to use ModelAttribute
//	@ModelAttribute
//	public void greetStudent (Model m , Student student) {
//		
//		m.addAttribute ("greetStudent" , student.getName());
//	}
	
	/*How to use post method   ==> result http://localhost:8083/addStudent (not detailed)
	  2nd Way:
	  1)Use @PostMapping("addStudent") with action name from the form tag
	  2)then go to the index.jsp and add method="post" inside the form tag
	*/
//	@PostMapping("addStudent") ==> result http://localhost:8083/addStudent (not detailed)
//	public String addStudent5 (@ModelAttribute("studentObject") Student student )
//	{
//		
//		return "result";
//	}
//	
//	//How to get a specific field from the object, you need to use ModelAttribute
//	@ModelAttribute
//	public void greetStudent (Model m , Student student) {
//		
//		m.addAttribute ("greetStudent" , student.getName());
//	}
	
	
	//How to use GET method
	
	//1.way
	/*
	 1)inside the method paranthesis type method=RequestMethod.GET
	 2)go to index.jsp and add method="get" inside the form tag
	 3)go to result.jsp file and type ==> ${studentList}
	 */
//	@RequestMapping (value = "getStudent" , method=RequestMethod.GET)
//	public String getStudent (Model m) {
//		
//		Collection<Student> students = new ArrayList<>();
//		students.add(new Student(101 , "Ali Can"));
//		students.add(new Student(102 , "Veli Can"));
//		students.add(new Student(103 , "Mary Star"));
//		students.add(new Student(104 , "Tom Hanks"));
//		students.add(new Student(105 , "Angie Ocean"));
//		
//		m.addAttribute("studentList" , students);
//		
//		return "result";
//	}
	//2.way
//	@GetMapping("getStudent")
//	public String getStudent (Model m) {
//		
//		Collection<Student> students = new ArrayList<>();
//		students.add(new Student(101 , "Ali Can"));
//		students.add(new Student(102 , "Veli Can"));
//		students.add(new Student(103 , "Mary Star"));
//		students.add(new Student(104 , "Tom Hanks"));
//		students.add(new Student(105 , "Angie Ocean"));
//		
//		m.addAttribute("studentList" , students);
//		
//		return "result";
//		
//	}	
	//How to get a specific student
	
	@GetMapping("getStudentWithId")
	public String getSpecificStudent (@RequestParam("id") int id,Model m) {
		
		ArrayList<Student> students = new ArrayList<>();
		students.add(new Student(101 , "Ali Can"));
		students.add(new Student(102 , "Veli Can"));
		students.add(new Student(103 , "Mary Star"));
		students.add(new Student(104 , "Tom Hanks"));
		students.add(new Student(105 , "Angie Ocean"));
	
	    int idx = -1;
	    for(Student w : students) {
	    	if (id == w.getId()) {
	    		idx = students.indexOf(w);
	    	}
	    }
	    if(idx== -1) {  //means no such id
	    	m.addAttribute("specificStudent" , "There is no such ID");
	    }else {
	    	m.addAttribute("specificStudent" , students.get(idx));
	    }
	   
	   return "result"; 
	    
	}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
