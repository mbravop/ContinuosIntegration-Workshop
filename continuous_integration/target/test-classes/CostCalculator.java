import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.team4.BasicMembership;
import com.team4.Feature;
import com.team4.MembershipType;

public class CostCalculator {
    

    @Test
    void tc001(){
        BasicMembership mem = new BasicMembership(20, 2);
        AdditionalFeature f = new AdditionalFeature("Personalized training",20);
        
        int costoTotal = mem.customizeFeatures(f) + mem.costForMember(2);
        costoTotal = mem.discount(costoTotal);
        assertEquals(72,costoTotal);
    }

    @Test
    void tc002(){
        BasicMembership mem = new BasicMembership(20, 2);
        AdditionalFeature f = new AdditionalFeature("Group class",30);

        int costoTotal = mem.customizeFeatures(f);
        assertEquals(50,costoTotal);
    }

    @Test
    void tec003(){
        PremiumMembership mem = new PremiumMembership(60,2);
        AdditionalFeature f = new AdditionalFeature("Specialized training",80);


        int costoTotal = mem.customizeFeatures(f) + mem.costForMember(2);
        costoTotal = mem.discount(costoTotal);
        costoTotal = mem.charge(costoTotal);

        assertEquals(214.2,costoTotal);
    }
}
