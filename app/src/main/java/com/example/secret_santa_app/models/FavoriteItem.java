package com.example.secret_santa_app.models;

import com.parse.ParseObject;


public class FavoriteItem {
    private String Name;
    private String UserID;
    private String ExtraText;
    private Boolean IsActive;
    private String Link;


    public FavoriteItem(String name, Boolean isActive, String userID, String extraText, String link) {
        this.Name = name;
        this.IsActive = isActive;
        this.UserID = userID;
        this.ExtraText = extraText;
        this.Link = link;
    }

    public String GetName() {
        return this.Name;
    }

    public boolean IsActive() {
        return this.IsActive;
    }

    public String GetUserID() { return this.UserID;  }

    public String GetLink(){
        return this.Link;
    }

    public String GetText(){
        return this.ExtraText;
    }


    public void StoreDatabase() {
        String favName = this.GetName();
        Boolean favActive = this.IsActive();
        String favUserID = this.GetUserID();
        String favLink = this.GetLink();
        String favText = this.GetText();

        ParseObject favObjectToStore = new ParseObject("FavoriteItems");
        favObjectToStore.put("Name", favName);
        favObjectToStore.put("Active", favActive);
        favObjectToStore.put("UserID", favUserID);
        favObjectToStore.put("Link", favLink);
        favObjectToStore.put("Text", favText);

        favObjectToStore.saveInBackground();
    }

}
