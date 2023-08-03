package solid.live.ocp;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 11, 2011
 * Time: 1:14:09 PM
 * To change this template use File | Settings | File Templates.
 */
public class ResourceAllocator {
    final static private int INVALID_RESOURCE_ID = -1;
    SpaceMethods spaceObj = new SpaceMethods();
    TimeMethods timeObj = new TimeMethods();

    public int allocate(ResourceType resourceType) {
        int resourceId=-1;
        selectResourceToBeAllocatedCase(resourceId, resourceType);
        return resourceId;
    }

    public void free(ResourceType resourceType, int resourceId) {
        selectRousorceToFreeSlot(resourceId, resourceType);
    }

    public void selectResourceToBeAllocatedCase(int resourceId, ResourceType resourceType){
        switch (resourceType) {
            case TIME_SLOT:
                resourceId = timeObj.findFreeTimeSlot();
                timeObj.markTimeSlotBusy(resourceId);
                break;
            case SPACE_SLOT:
                resourceId = spaceObj.findFreeSpaceSlot();
                spaceObj.markSpaceSlotBusy(resourceId);
                break;
            default:
                System.out.println("ERROR: Attempted to allocate invalid resource");
                resourceId = INVALID_RESOURCE_ID;
                break;
        }
    }

    public void selectRousorceToFreeSlot(int resourceId, ResourceType resourceType){
        switch (resourceType) {
            case TIME_SLOT:
                timeObj.markTimeSlotFree(resourceId);
                break;
            case SPACE_SLOT:
                spaceObj.markSpaceSlotFree(resourceId);
                break;

            default:
                System.out.println("ERROR: attempted to free invalid resource");
                break;
        }
    }

}


