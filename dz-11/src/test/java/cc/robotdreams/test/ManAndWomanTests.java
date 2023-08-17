package cc.robotdreams.test;
import cc.robotdreams.Man;
import cc.robotdreams.Woman;
import static org.testng.Assert.assertEquals;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public  class ManAndWomanTests
{
    @Test
    public void testIsRetiredMan() {
        Man john = new Man("John", "Doe", 70);
        Assert.assertTrue(john.isRetired());

        john.setAge(50);
        Assert.assertFalse(john.isRetired());

    }

    @Test
    public void testIsRetiredWoman() {
        Woman jane = new Woman("Jane", "Smith", 65);
        Assert.assertTrue(jane.isRetired());

        jane.setAge(55);
        Assert.assertFalse(jane.isRetired());
    }


    @Test
        public void testRegisterPartnership () {
            Man john = new Man("John", "Doe", 30);
            Woman jane = new Woman("Jane", "Smith", 28);

            john.registerPartnership(jane);

            Assert.assertEquals(john.getPartner(), jane);
            Assert.assertEquals(jane.getPartner(), john);
            Assert.assertEquals(john.getLastName(),jane.getLastName());
            }
        @Test
        public void testDeregisterPartnership() {
            Man john = new Man("John", "Doe", 32);
            Woman jane = new Woman("Jane", "Smith", 29);

            john.registerPartnership(jane);

            Assert.assertEquals(john.getPartner(), jane);
            Assert.assertEquals(jane.getPartner(), john);
            Assert.assertEquals(john.getLastName(),jane.getLastName());

            jane.deregisterPartnership(true);

            Assert.assertEquals(john.getPartner(), null);
            Assert.assertEquals(john.getLastName(), "Doe");
            Assert.assertEquals(jane.getPartner(), null);
            Assert.assertEquals(jane.getLastName(), "Smith");
        }

        public void testSetAge(){
            Man john = new Man("John", "Doe", 32);
            john.setAge(15);
            Assert.assertEquals(john.getAge(),15);
        }



}























