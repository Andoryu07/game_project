/**
 * Class used to implement the item Repair Tool
 */
public class RepairTool extends Item {
    /**
     * Constructor, contains super from Item class
     */
    public RepairTool() {
        super("Repair Tool", "Repair tool, you can repair stuff. Might come in handy later.");
    }

    /**
     * Method used to implement repair tool's behavior when used
     * @param player Who is attempting to use the item
     */
    @Override
    public void use(Player player) {
        Room currentRoom = player.getCurrentRoom();
        if (currentRoom.getName().equalsIgnoreCase("Cellar")) {
            System.out.println("🔧 You repaired the mechanism in the Cellar!");
        } else {
            System.out.println("❌ There's nothing to repair here.");
        }
    }
}
