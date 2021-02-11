
public class Sueldos {
	double sueldoMbruto = empleado1.sueldo;
	double sueldoMneto;
	double sueldoAbruto = empleado.sueldo * 12;
	double sueldoAneto;
	double IRPF_Boss = 32 / 100;
	double IRPF_Manager = 26 / 100;
	double IRPF_Senior = 24 / 100;
	double IRPF_Mid = 15 / 100;
	double IRPF_Junior = 2 / 100;

	switch (categoria) {
	case "BOSS": sueldoMneto = empleado1.sueldo - IRPF_Boss;
				 sueldoAneto = sueldoAbruto - IRPF_Boss;
	break;
	case "MANAGER": sueldoMneto = empleado1.sueldo - IRPF_Manager;
					sueldoAneto = sueldoAbruto - IRPF_Manager;
	break;
	case "SENIOR": sueldoMneto = empleado1.sueldo - IRPF_Senior;
				   sueldoAneto = sueldoAbruto - IRPF_Senior;
	break;
	case "MID": sueldoMneto = empleado1.sueldo - IRPF_Mid;
				sueldoAneto = sueldoAbruto - IRPF_Mid;
	break;
	case "JUNIOR": sueldoMneto = empleado1.sueldo - IRPF_Junior;
				   sueldoAneto = sueldoAbruto - IRPF_Junior;
	break;
	}
}
}
