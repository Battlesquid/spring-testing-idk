package application.controllers.person;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class ProductsController {
    @GetMapping("/products")
    public String test(@RequestParam(name="name", required = false) String name, Model model) {

        String[] itemNames = {"bagels", "pop tarts", "ham", "cream cheese", "yogurt", "asparagus", "lemonade", "cookies", "bacon", "eggs", "caprisun", "kool aid", "potato chips", "peperoni pizza", "big mac and cheese", "lunchables"};
        ArrayList<Item> items = new ArrayList<>();

        for(int i = 0; i < itemNames.length; i++) {
            items.add(new Item(itemNames[i], i));
        }

        model.addAttribute("items", items);
        return "products";
    }
}
