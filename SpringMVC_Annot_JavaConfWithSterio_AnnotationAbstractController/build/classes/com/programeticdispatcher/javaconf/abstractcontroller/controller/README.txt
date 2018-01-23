This Document Is used to understand the MetaData Driven Devlopment Approach
The Parameters for the methods you can take any thing. spring has provided
some set of parameter types so that you can able to use those. this will reduce the
lot of boiler plate code and you code will contain only mimulistic content only and 
you can return the any value outof spring provided return types spring has provided 
lot of return values and parameters types as well
Parameter Types
---------------

1)HttpRequest
2)HttpResonse
3)WebRequest
4)WebResponse
5)NativeWebRequest
6)NativeWebResponse
7)Map
8)Model
9)ModeMap
10)@RequestParam("x") -->To read request paramters
11)@PathParam("{x}") -->To Read Path Param
12)@MatrixParam("") -->To Read Matrix Param
13)HttpSession
14)@ModelAttribute
15)BindingResults

Return Type :-
--------------

1)ModelAndView
2)Model
3)Map
4)ModelMap
5)void
6)String

## This MetaData Driven Devlopment Programing Model has changed the complete 
   archetecture of spring bcz, Dispatcher Servlet has to call the controller
   bcz handler RequestMapping HandlerMApping will send the bean name and the
   method name to it. but dispatcher servlet know only request and response
   as paramters but our controller may take may not take bcz we are devloping
   on MetaData Based Application Devlopment so after reciving of the Details
   of Controller it will pass these details to RequestMappingHandlerAdopter
   This is one more component comming from Spring Mvc Incase of Annotation
   Driven Devlopment. so it will take the help from this component in calling
   with our required set of paramters and converting out return types into
   spring dispatcher servlet understandingreturn value i.e ModelAndView 
   componennt to it. This is Adopter class follows Adopter design pattern 
   this classes will convert one class or interface compatibility into 
   another class compatability. we may required to write more controllers
   but one handlerAdopter is wnough to call our controllers