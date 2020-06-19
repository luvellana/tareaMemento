package command_3;

import java.util.LinkedList;
import java.util.List;

public class Juego {
    private List<ICommand> commandList = new LinkedList<>();

    public void setCommand(ICommand command) {
        commandList.add(command);
    }

    public void executeCommands(){
        for (ICommand command : commandList) {
            command.execute();
        }
        commandList.clear();
    }
}
