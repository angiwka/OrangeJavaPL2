package pl.sda.OrangeJavaPL2.apiconsuming;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class MyFirstConsumerResponse {
//    {
//        "activity": "Learn how to fold a paper crane",
//            "type": "education",
//            "participants": 1,
//            "price": 0.1,
//            "link": "",
//            "key": "3136036",
//            "accessibility": 0.05
//    }

    private String activity;
    private String type;
    private Integer participants;
    private Double price;
    private String link;
    private String key;
    private Double accessibility; //"accessibility" : 0.7
    // Parse you custom JSON from external service
    // Create you Java Object
    // Parse JSON to Java Object
    // Log your Java Object using toStringMethod
}
