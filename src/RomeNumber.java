import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public enum RomeNumber {

I(1), II(2), III(3), IV(4), V(5), VI(6), VII(7), VIII(8), IX(9);

private int value;

    RomeNumber(int value) {
        this.value = value;
    }

public int toInt(){
        return value;
}

}
