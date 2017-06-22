package structural.composite;

import java.util.Iterator;

class Menu extends MenuComponent{

    
    Menu(String name, String url) {
        this.name = name;
        this.url = url;
    }

    MenuComponent add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
        return menuComponent;
    }
    MenuComponent remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
        return menuComponent;
    }
    
        @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(print(this));
        
        Iterator<MenuComponent> iterator = menuComponents.iterator();
        while(iterator.hasNext()) {
            MenuComponent MenuComponent = iterator.next();
            builder.append(MenuComponent.toString());
        }
        return builder.toString();
    }
    
}
