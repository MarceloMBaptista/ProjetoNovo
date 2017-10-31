package br.java.jsf;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("validador")
public class MyValidator implements Validator {

    public void validate(FacesContext context, UIComponent component, Object value)
        throws ValidatorException
    {
        System.out.println("MyValidator validate: " + value);
    }

}
