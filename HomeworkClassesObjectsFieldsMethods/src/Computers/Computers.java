package Computers;

public class Computers {

	public static void main(String[] args) {
		
		Computer laptop = new Computer();
		Computer desktopComp = new Computer();
		
		laptop.year = 2016;
		laptop.price = 1750.80;
		laptop.hardDiskMemory = 2000;
		laptop.isNotebook = true;
		laptop.freeMemory = 1500;
		laptop.operationSystem = "Windows 10";
		
		desktopComp.year = 2015;
		desktopComp.price = 1400.50;
		desktopComp.hardDiskMemory = 1000;
		desktopComp.isNotebook = false;
		desktopComp.freeMemory = 750;
		desktopComp.operationSystem = "Ubuntu 14.04";
		
		laptop.changeOperationSystem("Ubuntu 16.04");
		
		desktopComp.useMemory(150);
		System.out.println("Параметри на първия компютър: ");
		System.out.println("Година на производство: " + laptop.year);
		System.out.println("Цена: " + laptop.price);
		System.out.println("Лаптоп ли е: " + laptop.isNotebook);
		System.out.println("Големина на хард диска: " + laptop.hardDiskMemory + "GB");
		System.out.println("Свободна памет на компютъра: " + laptop.freeMemory + "GB");
		System.out.println("Операционна система: " + laptop.operationSystem);
		System.out.println();
		System.out.println("Параметри на втория компютър: ");
		System.out.println("Година на производство: " + desktopComp.year);
		System.out.println("Цена: " + desktopComp.price);
		System.out.println("Лаптоп ли е: " + desktopComp.isNotebook);
		System.out.println("Големина на хард диска: " + desktopComp.hardDiskMemory + "GB");
		System.out.println("Свободна памет на компютъра: " + desktopComp.freeMemory + "GB");
		System.out.println("Операционна система: " + desktopComp.operationSystem);

	}

}
