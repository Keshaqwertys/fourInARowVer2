import Model.Checks;
import Model.Constants;
import Model.Field;
import Model.Slot;
import org.junit.jupiter.api.Test;

import java.util.List;

public class Tests {


    @Test
    public void testCheckStatusBlueFirstVerticalLine(){
        Field.createNewField();
        Field newField = Field.getMainField();
        List<Slot> field = newField.getMatrix();
        field.get(0).belonging = Constants.BluePlayer;
        field.get(7).belonging = Constants.BluePlayer;
        field.get(14).belonging = Constants.BluePlayer;
        field.get(21).belonging = Constants.BluePlayer;
        assert(Checks.checkStatus() == Constants.BluePlayer);
        assert(Checks.checkStatus() != Constants.GreenPlayer);
        assert(Checks.checkStatus() != Constants.Empty);
    }

    @Test
    public void testCheckStatusGreenSecondVerticalLine(){
        Field.createNewField();
        Field newField = Field.getMainField();
        List<Slot> field = newField.getMatrix();
        field.get(7).belonging = Constants.GreenPlayer;
        field.get(8).belonging = Constants.GreenPlayer;
        field.get(9).belonging = Constants.GreenPlayer;
        field.get(10).belonging = Constants.GreenPlayer;
        assert(Checks.checkStatus() == Constants.GreenPlayer);
        assert(Checks.checkStatus() != Constants.BluePlayer);
        assert(Checks.checkStatus() != Constants.Empty);
    }

    @Test
    public void testCheckStatusGreenFirsDiagonalLine(){
        Field.createNewField();
        Field newField = Field.getMainField();
        List<Slot> field = newField.getMatrix();
        field.get(3).belonging = Constants.GreenPlayer;
        field.get(9).belonging = Constants.GreenPlayer;
        field.get(15).belonging = Constants.GreenPlayer;
        field.get(21).belonging = Constants.GreenPlayer;
        assert(Checks.checkStatus() == Constants.GreenPlayer);
        assert(Checks.checkStatus() != Constants.BluePlayer);
        assert(Checks.checkStatus() != Constants.Empty);
    }


    @Test
    public void testCheckStatusDraw(){
        Field.createNewField();
        Field newField = Field.getMainField();
        List<Slot> field = newField.getMatrix();
        field.get(0).belonging = Constants.BluePlayer;
        field.get(1).belonging = Constants.BluePlayer;
        field.get(2).belonging = Constants.BluePlayer;
        field.get(3).belonging = Constants.GreenPlayer;
        field.get(4).belonging = Constants.BluePlayer;
        field.get(5).belonging = Constants.BluePlayer;
        field.get(6).belonging = Constants.BluePlayer;
        field.get(7).belonging = Constants.GreenPlayer;
        field.get(8).belonging = Constants.GreenPlayer;
        field.get(9).belonging = Constants.GreenPlayer;
        field.get(10).belonging = Constants.BluePlayer;
        field.get(11).belonging = Constants.GreenPlayer;
        field.get(12).belonging = Constants.GreenPlayer;
        field.get(13).belonging = Constants.GreenPlayer;
        field.get(14).belonging = Constants.BluePlayer;
        field.get(15).belonging = Constants.BluePlayer;
        field.get(16).belonging = Constants.BluePlayer;
        field.get(17).belonging = Constants.GreenPlayer;
        field.get(18).belonging = Constants.BluePlayer;
        field.get(19).belonging = Constants.BluePlayer;
        field.get(20).belonging = Constants.BluePlayer;
        field.get(21).belonging = Constants.GreenPlayer;
        field.get(22).belonging = Constants.GreenPlayer;
        field.get(23).belonging = Constants.GreenPlayer;
        field.get(24).belonging = Constants.BluePlayer;
        field.get(25).belonging = Constants.GreenPlayer;
        field.get(26).belonging = Constants.GreenPlayer;
        field.get(27).belonging = Constants.GreenPlayer;
        field.get(28).belonging = Constants.BluePlayer;
        field.get(29).belonging = Constants.BluePlayer;
        field.get(30).belonging = Constants.BluePlayer;
        field.get(31).belonging = Constants.GreenPlayer;
        field.get(32).belonging = Constants.BluePlayer;
        field.get(33).belonging = Constants.BluePlayer;
        field.get(34).belonging = Constants.BluePlayer;
        field.get(35).belonging = Constants.GreenPlayer;
        field.get(36).belonging = Constants.GreenPlayer;
        field.get(37).belonging = Constants.GreenPlayer;
        field.get(38).belonging = Constants.BluePlayer;
        field.get(39).belonging = Constants.GreenPlayer;
        field.get(40).belonging = Constants.GreenPlayer;
        field.get(41).belonging = Constants.GreenPlayer;
        assert(Checks.checkStatus() != Constants.GreenPlayer);
        assert(Checks.checkStatus() != Constants.BluePlayer);
        assert(Checks.checkStatus() == Constants.Draw);
    }



    @Test
    public void testFindFreePosition_noFreePosition(){
        Field.createNewField();
        Field newField = Field.getMainField();
        List<Slot> field = newField.getMatrix();
        field.get(0).belonging = Constants.BluePlayer;
        field.get(7).belonging = Constants.BluePlayer;
        field.get(14).belonging = Constants.BluePlayer;
        field.get(21).belonging = Constants.BluePlayer;
        field.get(28).belonging = Constants.BluePlayer;
        field.get(35).belonging = Constants.BluePlayer;
        assert (Field.findFreePosition(newField.getLine(1)) == -1);
    }

}
