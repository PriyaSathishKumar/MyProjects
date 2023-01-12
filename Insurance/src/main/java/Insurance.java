import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Insurance {
    String policyHolderName;
    int age;
    String policyProvider;
    String policyType;
    int due;

}
