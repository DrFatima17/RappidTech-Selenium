package selenium_intro;

public class FindWithXpath {
    public static void main(String[] args) {
        /*
        ABSOLUTE XPATH:
        starts from beginning/root of HTML.
        used as a last resort to find element as it can easily break upon any changes to DOM (Document object model)

        /html/body/div[1]/form/input[2]

        RELATIVE XPATH:
        starts from any node. provides more flexible and precise way to locate elements

        Xpath based on attribute value:
        //input

        Xpath based on attribute value:
       //input[@type='month']

        Xpath starts with:  (comma used)
        //input[starts-with(@id,'e')]
        //a[starts-with(@class,'dJ') and@ href='/stays']

        Xpath ends with: (comma used)
        //input[ends-with(@type,'h')]

        find in all elements:
       (//*///@type )[5]         --> remove two front slashes after *

        /*

        one attribute is exactly the same while second one has only the attribute (without the value)
        //input[@name='email']/@type

        to search from text (comma used)
        //a[contains(text(),'Index')]
        OR
        //a[contains(.,'Index')]

        FROM PARENT/CHILD:

        from first child of element:
        //div/form/*[1]

        from last child of element
        //form/*[last()]
         or
        //form/input[last()]
        or
        //form/input[5]

        FROM SIBLINGS:
        from element following some sibling:
        //input[@value='fruits']/following-sibling::input
        //use [1] or [2] if there are more siblings following the value='fruits'


        *from element before some sibling (preceding sibling):
        //input[@value='fruits']/preceding-sibling::input

         */


    }

    }

