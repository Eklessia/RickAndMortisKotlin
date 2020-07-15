package cl.malditosnakamas.rickandmorty.personajes.domain.model;

public class Character {
    private Integer id;
    private String name;
    private String image;
    private Origin origin;

    public Character(Integer id, String name, String image, Origin origin) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.origin = origin;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Origin getOrigin() {
        return origin;
    }

    public void setOrigin(Origin origin) {
        this.origin = origin;
    }
}
