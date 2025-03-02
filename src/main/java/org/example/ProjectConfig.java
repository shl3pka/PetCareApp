package org.example;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "org.example")
public class ProjectConfig {

    @Primary
    @Bean
    Pet catBarsik(){
        Pet cat = new Pet();
        cat.setTypeOfAnimal("Cat");
        cat.setName("Barsik");
        cat.setWeight(6.2);
        cat.setAge(8);
        cat.setVaccined(true);
        cat.setHistory("Barsik doesn't like fish");
        return cat;
    }

    @Bean
    public EagerBean eagerBean() {
        return new EagerBean();
    }
    @Bean
    @Lazy
    public LazyBean lazyBean() {
        return new LazyBean();
    }
}

