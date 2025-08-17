package Day2;


	
	public class PostPayload {
	    private String title;
	    private String body;
	    private int userId;

	    public PostPayload(String title, String body, int userId) {
	        this.title = title;
	        this.body = body;
	        this.userId = userId;
	    }

	    // Getters and setters are mandatory for Jackson serialization/deserialization
	    public String getTitle() {
	        return title;
	    }

	    public void setTitle(String title) {
	        this.title = title;
	    }

	    public String getBody() {
	        return body;
	    }

	    public void setBody(String body) {
	        this.body = body;
	    }

	    public int getUserId() {
	        return userId;
	    }

	    public void setUserId(int userId) {
	        this.userId = userId;
	    }
	}
