package braian.fernandez.fittergym.logic;

import java.util.Date;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2023-12-26T18:14:28", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(clientes.class)
public class clientes_ { 

    public static volatile SingularAttribute<clientes, Integer> idCliente;
    public static volatile SingularAttribute<clientes, Date> fechaNacimiento;
    public static volatile SingularAttribute<clientes, String> apellido;
    public static volatile SingularAttribute<clientes, String> nombre;
    public static volatile SingularAttribute<clientes, Integer> dni;

}