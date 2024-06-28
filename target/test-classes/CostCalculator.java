import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.team4.AdditionalFeatures;
import com.team4.BasicMembership;
import com.team4.Feature;
import com.team4.MembershipType;

public class CostCalculator {
    

    @Test
    void tc001(){
        BasicMembership mem = new BasicMembership(20, 2);
        AdditionalFeature f = new AdditionalFeature("Personalized training",20);
        
        int costoTotal = mem.customizeFeatures(f);
        costoTotal = mem.costForMember(2);
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


        int costoTotal = mem.customizeFeatures(f);
        costoTotal = mem.costForMember(2);
        costoTotal = mem.discount(costoTotal);
        costoTotal = mem.charge(costoTotal);

        assertEquals(214.2,costoTotal);
    }

    @Test
    void tec004(){
        PremiumMembership mem = new PremiumMembership(60,1);
        AdditionalFeatures f = new AdditionalFeatures("Gym facilities",120);

        int costoTotal = mem.customizeFeatures(f);
        costoTotal = mem.charge(costoTotal);

        costoTotal = costoTotal -20;

        assertEquals(187,costoTotal);
    }

    @Test
    void tec005(){
        PremiumMembership mem = new PremiumMembership(60,2);
        AdditionalFeatures f1 = new AdditionalFeatures("Gym facilities",120);
        AdditionalFeatures f2 = new AdditionalFeatures("Specialized Training",80);
        AdditionalFeatures f3 = new AdditionalFeatures("Personalized Trainig",20);
        AdditionalFeatures f4 = new AdditionalFeatures("Group class",30);

        int costoTotal = mem.customizeFeatures(f1) + mem.customizeFeatures(f2) + mem.customizeFeatures(f3) + mem.customizeFeatures(f4) + mem.customizeFeatures(f5);
        costoTotal = mem.costForMember(2);
        costoTotal = mem.charge(costoTotal);
        costoTotal = costoTotal -50;
        assertEquals(601,costoTotal);

    }

    
}
