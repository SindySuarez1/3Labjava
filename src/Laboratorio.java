import java.util.Locale;
import java.util.Scanner;

public class Laboratorio {
    public static void superM(){

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el total de su compra: ");
        float totalCompra = scanner.nextFloat();

        System.out.print("¿Cuántos productos compró?: ");
        int totalProductos = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite'SI' si tiene membresía o 'NO' si no tiene: ");
        String opcion = scanner.nextLine().toLowerCase();

        float totalPagar = 0;
        float descuento = 0;

        if(opcion.equals("si")){
            descuento += totalCompra * 0.10f;
        }if(totalProductos > 10){
            descuento += totalCompra * 0.5f;
        }
        totalPagar = totalCompra - descuento;

        System.out.println("Descuento total: $" + descuento);
        System.out.println("Total a pagar: $" + totalPagar);

        scanner.close();
    }

    public static void mascotas(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tipo de animal: ");
        String animal = scanner.nextLine().toLowerCase();

        System.out.print("Ingrese la edad del animal: ");
        int edad = scanner.nextInt();

        String veterinario = "";
        boolean vacuna = false;

        switch (animal){
            case "perro":
                veterinario = "Doctor Perrito";
                if(edad > 5){
                    vacuna = true;
                }
                break;
            case "gato":
                veterinario = "Doctor Gatito";
                if(edad > 5){
                    vacuna = true;
                }
                break;
            case "ave":
                veterinario = "Doctor del cielo";
                break;
            default:
                veterinario = "Doctor para todos";
                break;
        }
        System.out.println("Veterinario asignado" + veterinario);

        if(vacuna){
            System.out.println("se recomienda una vacunación adicional");
        }else{
            System.out.println("No se recomienda vacuna adicional");
        }

        scanner.close();


    }
    public static void parqueadero(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el tipo de vehiculo(auto, moto, bicicleta): ");
        String tipoVehiculo = scanner.nextLine().toLowerCase();

        System.out.print("Ingrese la hora de llegada en formato (0-23): ");
        int hora = scanner.nextInt();

        float valorparqueo = 0f;
        float descuento = 0f;
        float total = 0f;

        switch (tipoVehiculo){
            case "auto":
                valorparqueo = 20000f;
                break;
            case "moto":
                valorparqueo = 10000f;
                break;
            case "bicicleta":
                valorparqueo = 5000f;
                break;
            default:
                System.out.println("Vehículo no valido");
                break;
        }
        if (hora >= 20){
            descuento = valorparqueo * 0.20f;
            total = valorparqueo - descuento;
            System.out.println("Valor a pagar: $" + total);
        }else{
            System.out.println("Valor a pagar: $" + valorparqueo);
        }
        scanner.close();
    }

    public static void tiendaRopa(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el tipo de prenda que desea comprar 'Camisa' 'Pantalón' 'Chaqueta': ");
        String tipoPrenda = scanner.nextLine().toLowerCase();

        System.out.print("Ingrese la cantidad de prendas compradas: ");
        int cantidadP = scanner.nextInt();

        float valorPrenda = 0f;
        float descuentoP = 0f;
        float total = 0f;

        switch (tipoPrenda){
            case "camisa":
                valorPrenda = 20000f;
                break;
            case "pantalon":
                valorPrenda = 50000f;
                break;
            case "chaqueta":
                valorPrenda = 100000f;
                break;
            default:
                System.out.println("Esta prenda no está disponible");
                break;
        }
        total = cantidadP * valorPrenda;

        if(cantidadP > 5){
            descuentoP = total * 0.15f;
            total -= descuentoP;
            System.out.println("El total a pagar con descuento es: " + total);
        }else {
            System.out.println("El total a pagar es: " + total);
        }

    }
    }

