/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyect;
    
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


/**
 *
 * @author polo2
 */
public class Supermercado {
      
    public static void main(String[] args) {
        // Mapa para almacenar los productos y sus precios en la moneda base (por ejemplo, dólares)
        Map<String, Double> productos = new HashMap<>();
        productos.put("Leche", 2.5);
        productos.put("Pan", 1.0);
        productos.put("Huevos", 3.0);
        productos.put("Chesco", 2.5);
        productos.put("Chorizon", 1.0);
        productos.put("Salami", 3.0);

        // Factor de conversión para diferentes monedas
        double factorConversionDolaresAEuros = 0.85;
        double factorConversionDolaresAPesos = 20.0;

        Scanner scanner = new Scanner(System.in);

        // Selección de productos
        System.out.println("Productos disponibles:");
        for (String producto : productos.keySet()) {
            System.out.println(producto + ": $" + productos.get(producto));
        }

        System.out.println("Ingrese el nombre del producto que desea comprar:");
        String productoSeleccionado = scanner.nextLine();

        if (!productos.containsKey(productoSeleccionado)) {
            System.out.println("Producto no encontrado. Saliendo del programa.");
            return;
        }

        // Cantidad de productos
        System.out.println("Ingrese la cantidad que desea comprar:");
        int cantidad = scanner.nextInt();

        // Calcular el total en la moneda base
        double totalDolares = productos.get(productoSeleccionado) * cantidad;

        // Convertir a otras monedas
        double totalEuros = totalDolares * factorConversionDolaresAEuros;
        double totalPesos = totalDolares * factorConversionDolaresAPesos;

        // Mostrar resultados
        System.out.println("Total en dólares: $" + totalDolares);
        System.out.println("Total en euros: €" + totalEuros);
        System.out.println("Total en pesos: $" + totalPesos);

        // Cerrar el scanner
        scanner.close();
        
    }
}


