package Interface;


public class Friend extends Person {
    private Hobby hobby;
    
    public Friend(String name, int age, Hobby hobby) {
        super(name, age);
        this.hobby = hobby;
    }

    public String chill() {
        return getName() + " is chilling";
    }

    public String play(Friend[] friends) {
        if (friends == null || friends.length == 0) {
            return "playing " + hobby;
        } else if (friends.length == 1) {
            return "playing " + hobby + " with " + friends[0].getName();
        } else if (friends.length == 2) {
            return "playing " + hobby + " with " + friends[0].getName() + " and " + friends[1].getName();
        } else {
            StringBuilder sb = new StringBuilder("playing " + hobby + " with ");
            for (int i = 0; i < friends.length - 1; i++) {
                sb.append(friends[i].getName()).append(", ");
            }
            sb.append("and ").append(friends[friends.length - 1].getName());
            return sb.toString();
        }
    }

    /**
     * Compares this Friend object with another object to check if they are equal.
     * Two Friend objects are considered equal if they have the same name, age, and hobby.
     * 
     * @param obj The object to compare with this Friend.
     * @return true if the objects are equal, false otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        // Check if the objects are the same reference, which implies they are equal.
        if (this == obj) {
            return true;
        }

        // Check if the provided object is of a different class, indicating they are not equal.
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        // Cast the object to a Friend to compare properties.
        Friend otherFriend = (Friend) obj;

        // Compare the name, age, and hobby to determine equality.
        return getName().equals(otherFriend.getName()) &&
               getAge() == otherFriend.getAge() &&
               hobby.equals(otherFriend.hobby);
    }
    @Override
    public String toString() {
        return super.toString() + " " + hobby;
    }

}

