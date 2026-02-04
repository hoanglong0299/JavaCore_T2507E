package asm4.vehicle;

public class Transport {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[4];
        vehicles[0] = new Car("Toyota Camry", 200);
        vehicles[1] = new Bike("Giant Escape", 30);
        vehicles[2] = new Train("Tàu Thống Nhất", 120);
        vehicles[3] = new Plane("Boeing 747", 900);

        System.out.println("=== KIỂM TRA HỆ THỐNG GIAO THÔNG ===");
        for (Vehicle v : vehicles) {
            v.move();
        }
    }
}
