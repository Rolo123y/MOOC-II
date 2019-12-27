package week9.Printer.Run_;

public class Run_ {

	public static void main(String[] args) throws Exception {

		Printer printer = new Printer("21.Printer\\textfile.txt");

		printer.printLinesWhichContain("Väinämöinen");
		System.out.println("-----");
		printer.printLinesWhichContain("Frank Zappa");
		System.out.println("-----");
		printer.printLinesWhichContain("");
		System.out.println("-----");
	}

}
