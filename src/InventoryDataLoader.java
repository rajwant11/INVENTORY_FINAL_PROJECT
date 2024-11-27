import java.io.IOException;
import java.util.Scanner;

public interface InventoryDataLoader {
    void loadData(String filename) throws IOException;
}
