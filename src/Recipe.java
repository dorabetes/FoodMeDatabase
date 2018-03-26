public class Recipe {

    private String recipeName, directions, servings, timeNeeded, ImageURL;
    private String objectId;
    private String ownerId;

    public Recipe(){
    }

    public Recipe(String recipeName, String recipe, String objectId, String ownerId, String url) {
        this.recipeName = recipeName;
        this.objectId = objectId;
        this.ownerId = ownerId;
        this.ImageURL = url;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    public String getObjectId() {
        return objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getDirections() {
        return directions;
    }

    public void setDirections(String directions) {
        this.directions = directions;
    }

    public String getServings() {
        return servings;
    }

    public void setServings(String servings) {
        this.servings = servings;
    }

    public String getTimeNeeded() {
        return timeNeeded;
    }

    public void setTimeNeeded(String timeNeeded) {
        this.timeNeeded = timeNeeded;
    }

    public String getImageURL() {
        return ImageURL;
    }

    public void setImageURL(String url) {
        this.ImageURL = url;
    }
}
