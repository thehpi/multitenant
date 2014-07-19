package nl.mrdm;

import nl.mrdm.qualifier.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class DatabaseProducer {

    private static Logger logger = LoggerFactory.getLogger(DatabaseProducer.class);

    @Inject
    EntityManagerHolder emHolder;

    @PersistenceContext(unitName = "test1")
    private EntityManager em1;

    @PersistenceContext(unitName = "test2")
    private EntityManager em2;

    @Produces
    @DbTest1
    public EntityManager createEntityManager1() {
        return em1;
    }

    @Produces
    @DbTest2
    public EntityManager createEntityManager2() {
        return em2;
    }

    @PersistenceContext(unitName = "test3")
    private EntityManager em3;

    @Produces
    @DbTest3
    public EntityManager createEntityManager3() {
        return em3;
    }

    @PersistenceContext(unitName = "test4")
    private EntityManager em4;

    @Produces
    @DbTest4
    public EntityManager createEntityManager4() {
        return em4;
    }

    @PersistenceContext(unitName = "test5")
    private EntityManager em5;

    @Produces
    @DbTest5
    public EntityManager createEntityManager5() {
        return em5;
    }

    @PersistenceContext(unitName = "test6")
    private EntityManager em6;

    @Produces
    @DbTest6
    public EntityManager createEntityManager6() {
        return em6;
    }

    @PersistenceContext(unitName = "test7")
    private EntityManager em7;

    @Produces
    @DbTest7
    public EntityManager createEntityManager7() {
        return em7;
    }

    @PersistenceContext(unitName = "test8")
    private EntityManager em8;

    @Produces
    @DbTest8
    public EntityManager createEntityManager8() {
        return em8;
    }

    @PersistenceContext(unitName = "test9")
    private EntityManager em9;

    @Produces
    @DbTest9
    public EntityManager createEntityManager9() {
        return em9;
    }

    @PersistenceContext(unitName = "test10")
    private EntityManager em10;

    @Produces
    @DbTest10
    public EntityManager createEntityManager10() {
        return em10;
    }

    @PersistenceContext(unitName = "test11")
    private EntityManager em11;

    @Produces
    @DbTest11
    public EntityManager createEntityManager11() {
        return em11;
    }

    @PersistenceContext(unitName = "test12")
    private EntityManager em12;

    @Produces
    @DbTest12
    public EntityManager createEntityManager12() {
        return em12;
    }

    @PersistenceContext(unitName = "test13")
    private EntityManager em13;

    @Produces
    @DbTest13
    public EntityManager createEntityManager13() {
        return em13;
    }

    @PersistenceContext(unitName = "test14")
    private EntityManager em14;

    @Produces
    @DbTest14
    public EntityManager createEntityManager14() {
        return em14;
    }

    @PersistenceContext(unitName = "test15")
    private EntityManager em15;

    @Produces
    @DbTest15
    public EntityManager createEntityManager15() {
        return em15;
    }

    @PersistenceContext(unitName = "test16")
    private EntityManager em16;

    @Produces
    @DbTest16
    public EntityManager createEntityManager16() {
        return em16;
    }

    @PersistenceContext(unitName = "test17")
    private EntityManager em17;

    @Produces
    @DbTest17
    public EntityManager createEntityManager17() {
        return em17;
    }

    @PersistenceContext(unitName = "test18")
    private EntityManager em18;

    @Produces
    @DbTest18
    public EntityManager createEntityManager18() {
        return em18;
    }

    @PersistenceContext(unitName = "test19")
    private EntityManager em19;

    @Produces
    @DbTest19
    public EntityManager createEntityManager19() {
        return em19;
    }

    @PersistenceContext(unitName = "test20")
    private EntityManager em20;

    @Produces
    @DbTest20
    public EntityManager createEntityManager20() {
        return em20;
    }

    @PersistenceContext(unitName = "test21")
    private EntityManager em21;

    @Produces
    @DbTest21
    public EntityManager createEntityManager21() {
        return em21;
    }

    @PersistenceContext(unitName = "test22")
    private EntityManager em22;

    @Produces
    @DbTest22
    public EntityManager createEntityManager22() {
        return em22;
    }

    @PersistenceContext(unitName = "test23")
    private EntityManager em23;

    @Produces
    @DbTest23
    public EntityManager createEntityManager23() {
        return em23;
    }

    @PersistenceContext(unitName = "test24")
    private EntityManager em24;

    @Produces
    @DbTest24
    public EntityManager createEntityManager24() {
        return em24;
    }

    @PersistenceContext(unitName = "test25")
    private EntityManager em25;

    @Produces
    @DbTest25
    public EntityManager createEntityManager25() {
        return em25;
    }

    @PersistenceContext(unitName = "test26")
    private EntityManager em26;

    @Produces
    @DbTest26
    public EntityManager createEntityManager26() {
        return em26;
    }

    @PersistenceContext(unitName = "test27")
    private EntityManager em27;

    @Produces
    @DbTest27
    public EntityManager createEntityManager27() {
        return em27;
    }

    @PersistenceContext(unitName = "test28")
    private EntityManager em28;

    @Produces
    @DbTest28
    public EntityManager createEntityManager28() {
        return em28;
    }

    @PersistenceContext(unitName = "test29")
    private EntityManager em29;

    @Produces
    @DbTest29
    public EntityManager createEntityManager29() {
        return em29;
    }

    @PersistenceContext(unitName = "test30")
    private EntityManager em30;

    @Produces
    @DbTest30
    public EntityManager createEntityManager30() {
        return em30;
    }

    @PersistenceContext(unitName = "test31")
    private EntityManager em31;

    @Produces
    @DbTest31
    public EntityManager createEntityManager31() {
        return em31;
    }

    @PersistenceContext(unitName = "test32")
    private EntityManager em32;

    @Produces
    @DbTest32
    public EntityManager createEntityManager32() {
        return em32;
    }

    @PersistenceContext(unitName = "test33")
    private EntityManager em33;

    @Produces
    @DbTest33
    public EntityManager createEntityManager33() {
        return em33;
    }

    @PersistenceContext(unitName = "test34")
    private EntityManager em34;

    @Produces
    @DbTest34
    public EntityManager createEntityManager34() {
        return em34;
    }

    @PersistenceContext(unitName = "test35")
    private EntityManager em35;

    @Produces
    @DbTest35
    public EntityManager createEntityManager35() {
        return em35;
    }

    @PersistenceContext(unitName = "test36")
    private EntityManager em36;

    @Produces
    @DbTest36
    public EntityManager createEntityManager36() {
        return em36;
    }

    @PersistenceContext(unitName = "test37")
    private EntityManager em37;

    @Produces
    @DbTest37
    public EntityManager createEntityManager37() {
        return em37;
    }

    @PersistenceContext(unitName = "test38")
    private EntityManager em38;

    @Produces
    @DbTest38
    public EntityManager createEntityManager38() {
        return em38;
    }

    @PersistenceContext(unitName = "test39")
    private EntityManager em39;

    @Produces
    @DbTest39
    public EntityManager createEntityManager39() {
        return em39;
    }

    @PersistenceContext(unitName = "test40")
    private EntityManager em40;

    @Produces
    @DbTest40
    public EntityManager createEntityManager40() {
        return em40;
    }

    @PersistenceContext(unitName = "test41")
    private EntityManager em41;

    @Produces
    @DbTest41
    public EntityManager createEntityManager41() {
        return em41;
    }

    @PersistenceContext(unitName = "test42")
    private EntityManager em42;

    @Produces
    @DbTest42
    public EntityManager createEntityManager42() {
        return em42;
    }

    @PersistenceContext(unitName = "test43")
    private EntityManager em43;

    @Produces
    @DbTest43
    public EntityManager createEntityManager43() {
        return em43;
    }

    @PersistenceContext(unitName = "test44")
    private EntityManager em44;

    @Produces
    @DbTest44
    public EntityManager createEntityManager44() {
        return em44;
    }

    @PersistenceContext(unitName = "test45")
    private EntityManager em45;

    @Produces
    @DbTest45
    public EntityManager createEntityManager45() {
        return em45;
    }

    @PersistenceContext(unitName = "test46")
    private EntityManager em46;

    @Produces
    @DbTest46
    public EntityManager createEntityManager46() {
        return em46;
    }

    @PersistenceContext(unitName = "test47")
    private EntityManager em47;

    @Produces
    @DbTest47
    public EntityManager createEntityManager47() {
        return em47;
    }

    @PersistenceContext(unitName = "test48")
    private EntityManager em48;

    @Produces
    @DbTest48
    public EntityManager createEntityManager48() {
        return em48;
    }

    @PersistenceContext(unitName = "test49")
    private EntityManager em49;

    @Produces
    @DbTest49
    public EntityManager createEntityManager49() {
        return em49;
    }

    @PersistenceContext(unitName = "test50")
    private EntityManager em50;

    @Produces
    @DbTest50
    public EntityManager createEntityManager50() {
        return em50;
    }

    @PersistenceContext(unitName = "test51")
    private EntityManager em51;

    @Produces
    @DbTest51
    public EntityManager createEntityManager51() {
        return em51;
    }

    @PersistenceContext(unitName = "test52")
    private EntityManager em52;

    @Produces
    @DbTest52
    public EntityManager createEntityManager52() {
        return em52;
    }

    @PersistenceContext(unitName = "test53")
    private EntityManager em53;

    @Produces
    @DbTest53
    public EntityManager createEntityManager53() {
        return em53;
    }

    @PersistenceContext(unitName = "test54")
    private EntityManager em54;

    @Produces
    @DbTest54
    public EntityManager createEntityManager54() {
        return em54;
    }

    @PersistenceContext(unitName = "test55")
    private EntityManager em55;

    @Produces
    @DbTest55
    public EntityManager createEntityManager55() {
        return em55;
    }

    @PersistenceContext(unitName = "test56")
    private EntityManager em56;

    @Produces
    @DbTest56
    public EntityManager createEntityManager56() {
        return em56;
    }

    @PersistenceContext(unitName = "test57")
    private EntityManager em57;

    @Produces
    @DbTest57
    public EntityManager createEntityManager57() {
        return em57;
    }

    @PersistenceContext(unitName = "test58")
    private EntityManager em58;

    @Produces
    @DbTest58
    public EntityManager createEntityManager58() {
        return em58;
    }

    @PersistenceContext(unitName = "test59")
    private EntityManager em59;

    @Produces
    @DbTest59
    public EntityManager createEntityManager59() {
        return em59;
    }

    @PersistenceContext(unitName = "test60")
    private EntityManager em60;

    @Produces
    @DbTest60
    public EntityManager createEntityManager60() {
        return em60;
    }

    @PersistenceContext(unitName = "test61")
    private EntityManager em61;

    @Produces
    @DbTest61
    public EntityManager createEntityManager61() {
        return em61;
    }

    @PersistenceContext(unitName = "test62")
    private EntityManager em62;

    @Produces
    @DbTest62
    public EntityManager createEntityManager62() {
        return em62;
    }

    @PersistenceContext(unitName = "test63")
    private EntityManager em63;

    @Produces
    @DbTest63
    public EntityManager createEntityManager63() {
        return em63;
    }

    @PersistenceContext(unitName = "test64")
    private EntityManager em64;

    @Produces
    @DbTest64
    public EntityManager createEntityManager64() {
        return em64;
    }

    @PersistenceContext(unitName = "test65")
    private EntityManager em65;

    @Produces
    @DbTest65
    public EntityManager createEntityManager65() {
        return em65;
    }

    @PersistenceContext(unitName = "test66")
    private EntityManager em66;

    @Produces
    @DbTest66
    public EntityManager createEntityManager66() {
        return em66;
    }

    @PersistenceContext(unitName = "test67")
    private EntityManager em67;

    @Produces
    @DbTest67
    public EntityManager createEntityManager67() {
        return em67;
    }

    @PersistenceContext(unitName = "test68")
    private EntityManager em68;

    @Produces
    @DbTest68
    public EntityManager createEntityManager68() {
        return em68;
    }

    @PersistenceContext(unitName = "test69")
    private EntityManager em69;

    @Produces
    @DbTest69
    public EntityManager createEntityManager69() {
        return em69;
    }

    @PersistenceContext(unitName = "test70")
    private EntityManager em70;

    @Produces
    @DbTest70
    public EntityManager createEntityManager70() {
        return em70;
    }

    @PersistenceContext(unitName = "test71")
    private EntityManager em71;

    @Produces
    @DbTest71
    public EntityManager createEntityManager71() {
        return em71;
    }

    @PersistenceContext(unitName = "test72")
    private EntityManager em72;

    @Produces
    @DbTest72
    public EntityManager createEntityManager72() {
        return em72;
    }

    @PersistenceContext(unitName = "test73")
    private EntityManager em73;

    @Produces
    @DbTest73
    public EntityManager createEntityManager73() {
        return em73;
    }

    @PersistenceContext(unitName = "test74")
    private EntityManager em74;

    @Produces
    @DbTest74
    public EntityManager createEntityManager74() {
        return em74;
    }

    @PersistenceContext(unitName = "test75")
    private EntityManager em75;

    @Produces
    @DbTest75
    public EntityManager createEntityManager75() {
        return em75;
    }

    @PersistenceContext(unitName = "test76")
    private EntityManager em76;

    @Produces
    @DbTest76
    public EntityManager createEntityManager76() {
        return em76;
    }

    @PersistenceContext(unitName = "test77")
    private EntityManager em77;

    @Produces
    @DbTest77
    public EntityManager createEntityManager77() {
        return em77;
    }

    @PersistenceContext(unitName = "test78")
    private EntityManager em78;

    @Produces
    @DbTest78
    public EntityManager createEntityManager78() {
        return em78;
    }

    @PersistenceContext(unitName = "test79")
    private EntityManager em79;

    @Produces
    @DbTest79
    public EntityManager createEntityManager79() {
        return em79;
    }

    @PersistenceContext(unitName = "test80")
    private EntityManager em80;

    @Produces
    @DbTest80
    public EntityManager createEntityManager80() {
        return em80;
    }

    @PersistenceContext(unitName = "test81")
    private EntityManager em81;

    @Produces
    @DbTest81
    public EntityManager createEntityManager81() {
        return em81;
    }

    @PersistenceContext(unitName = "test82")
    private EntityManager em82;

    @Produces
    @DbTest82
    public EntityManager createEntityManager82() {
        return em82;
    }

    @PersistenceContext(unitName = "test83")
    private EntityManager em83;

    @Produces
    @DbTest83
    public EntityManager createEntityManager83() {
        return em83;
    }

    @PersistenceContext(unitName = "test84")
    private EntityManager em84;

    @Produces
    @DbTest84
    public EntityManager createEntityManager84() {
        return em84;
    }

    @PersistenceContext(unitName = "test85")
    private EntityManager em85;

    @Produces
    @DbTest85
    public EntityManager createEntityManager85() {
        return em85;
    }

    @PersistenceContext(unitName = "test86")
    private EntityManager em86;

    @Produces
    @DbTest86
    public EntityManager createEntityManager86() {
        return em86;
    }

    @PersistenceContext(unitName = "test87")
    private EntityManager em87;

    @Produces
    @DbTest87
    public EntityManager createEntityManager87() {
        return em87;
    }

    @PersistenceContext(unitName = "test88")
    private EntityManager em88;

    @Produces
    @DbTest88
    public EntityManager createEntityManager88() {
        return em88;
    }

    @PersistenceContext(unitName = "test89")
    private EntityManager em89;

    @Produces
    @DbTest89
    public EntityManager createEntityManager89() {
        return em89;
    }

    @PersistenceContext(unitName = "test90")
    private EntityManager em90;

    @Produces
    @DbTest90
    public EntityManager createEntityManager90() {
        return em90;
    }

    @PersistenceContext(unitName = "test91")
    private EntityManager em91;

    @Produces
    @DbTest91
    public EntityManager createEntityManager91() {
        return em91;
    }

    @PersistenceContext(unitName = "test92")
    private EntityManager em92;

    @Produces
    @DbTest92
    public EntityManager createEntityManager92() {
        return em92;
    }

    @PersistenceContext(unitName = "test93")
    private EntityManager em93;

    @Produces
    @DbTest93
    public EntityManager createEntityManager93() {
        return em93;
    }

    @PersistenceContext(unitName = "test94")
    private EntityManager em94;

    @Produces
    @DbTest94
    public EntityManager createEntityManager94() {
        return em94;
    }

    @PersistenceContext(unitName = "test95")
    private EntityManager em95;

    @Produces
    @DbTest95
    public EntityManager createEntityManager95() {
        return em95;
    }

    @PersistenceContext(unitName = "test96")
    private EntityManager em96;

    @Produces
    @DbTest96
    public EntityManager createEntityManager96() {
        return em96;
    }

    @PersistenceContext(unitName = "test97")
    private EntityManager em97;

    @Produces
    @DbTest97
    public EntityManager createEntityManager97() {
        return em97;
    }

    @PersistenceContext(unitName = "test98")
    private EntityManager em98;

    @Produces
    @DbTest98
    public EntityManager createEntityManager98() {
        return em98;
    }

    @PersistenceContext(unitName = "test99")
    private EntityManager em99;

    @Produces
    @DbTest99
    public EntityManager createEntityManager99() {
        return em99;
    }

    @PersistenceContext(unitName = "test100")
    private EntityManager em100;

    @Produces
    @DbTest100
    public EntityManager createEntityManager100() {
        return em100;
    }



    @Produces
    @Database
    public EntityManager createCurrentEntityManager() {
        return emHolder.getEm();
    }

//    @PersistenceUnit(unitName = "hans")
//    private EntityManagerFactory emf1;

//    @PersistenceUnit(unitName = "test2")
//    private EntityManagerFactory emf2;
//
//    @Produces
//    @PersistenceContext(unitName = "test")
//    @Produces
//    @DbTest1
//    public EntityManager createEntityManager() {
//        Properties properties = new Properties();
//        properties.put("javax.persistence.jtaDataSource", "java:/jboss/datasources/hans");
//        properties.put("javax.persistence.transactionType", "RESOURCE_LOCAL");
//        properties.put("hibernate.dialect", "org.hibernate.dialect.MySQL5InnoDBDialect");
//        properties.put("hibernate.show_sql", "true");
//        properties.put("hibernate.format_sql", "true");
//
//        return emf1.createEntityManager(properties);
//    }

//    @Produces
//    @DbTest2
//    @PersistenceContext(unitName = "test2")
//    public EntityManager createEntityManager2() {
//        return emf1.createEntityManager();
//    }

//    public void dispose(@Disposes @DbTest1 EntityManager entityManager) {
//        if (entityManager.isOpen()) {
//            entityManager.close();
//        }
//    }
}
