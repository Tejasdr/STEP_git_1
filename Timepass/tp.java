// this is tp

public class tp{
	
	public static void cat(File named) {
    RandomAccessFile input = null;
    String line = null;

    try {
        input = new RandomAccessFile(named, "r");
        while ((line = input.readLine()) != null) {
            System.out.println(line);
        }
        return;
    } 
	catch(FileNotFoundException f) {
        System.out.println("File: " + named + " not found exception");
    }
	catch(Exception e) {
        System.out.println(e);
	}
	finally {
		
        if (input != null) {
            try {
                input.close();
            } 
			catch(IOException io) {
				System.out.println("Exception found in the Finally clause : Type of io exception")
				System.out.println(io);
            }
        }
    }
}

}