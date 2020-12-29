package org.umn.research.evsimulator;

import ilog.concert.IloException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Application {

    private static boolean writeToFile = true;

    public static void main(String [] args) throws IloException, IOException
    {
        double ratio = 1.0/6;
        double scale = 1.0;
        int size = 10;

        double betaVals[] = new double[] {3.439960342374876, 8.097870826489658, 0.7865109230592704, 1.9227934481311315, 2.538092677437387, 0.060105582704553795, 2.7968054421635546, 5.920648028028065, 9.298320057672802, 9.554961400280215, 9.045233033601669, 7.598954368710228, 6.90208992852467, 3.3162347730243145, 7.012901164691915, 5.270437909713821, 2.01158726435711, 6.42008658807743, 9.213552824430757, 3.1711975526900993, 8.584651257297962, 8.690089014854921, 6.940128442183207, 1.9736459667485695, 3.7425438187920035, 2.8777140347483154, 9.592882929484807, 5.6180679566996155, 8.742629874251012, 8.53446317258638, 8.283100110881671, 4.368939684522937, 6.945926438802882, 6.213067626858867, 0.3074594190444857, 1.1039822647073183, 9.819863503434355, 5.272427606558531, 1.5105691173986935, 4.3076577285974516, 1.4794892899170464, 0.8994722632222207, 7.427837762128363, 3.4244453396204397, 2.0457502181764675, 1.0601482095885617, 6.710155591266203, 3.274785068980759, 0.18735678824574942, 2.759375912970566, 3.3907259449705105, 9.395233984928069, 5.613144932322479, 4.332528493541789, 1.8430224709730603, 8.153004557790997, 2.9947296304887647, 1.2312991711455967, 8.258303710577664, 5.749057113448278, 9.682493825764627, 7.7920262971154255, 7.471608542538686, 0.6595126495185077, 3.2416848992417293, 0.8957930783847878, 9.114690844114556, 8.629775098006062, 9.55406084695182, 3.583065285766623, 9.430309600490675, 5.535533107087998, 0.4145769773143637, 5.906745510642645, 6.117741637070204, 7.3024099900914266, 9.407841546159375, 5.268617351736523, 2.285961488017633, 2.423354233128463, 9.694964050521047, 4.829595439446993, 6.967726634857193, 6.582028848726757, 2.0885630335661465, 3.3858681296044866, 9.973526819727303, 8.66060307931299, 6.929452895719356, 0.7544216221743905, 0.15901291972383103, 4.609660468899314, 4.381504850954986, 7.9105762450908115, 6.640779366977969, 4.651760047904218, 1.121026966657519, 5.95270938488845, 4.961276409803393, 1.2407498088877345, 2.49840788973263, 1.213029195835672, 8.053946636388163, 7.392684221963045, 9.241553935007998, 7.033059229556753, 1.0759776001660237, 4.495054964617085, 0.08508428045017946, 0.4687484142664744, 6.780213623299555, 5.847341373284536, 6.895885756334531, 0.5314795591769883, 8.130932086044293, 3.9721586694425093, 6.259477910674571, 2.6091235175521286, 7.52394389754974, 4.023140091777849, 7.355026250875837, 7.962266009761221, 6.339660452896384, 6.883545403671923, 2.3913480121067243, 0.24360998529233568, 7.731269750498269, 4.433829138756947, 1.3745073076409153, 0.06933909213123868, 0.23831230390822133, 1.2335528272878937, 9.505340404873374, 5.544595853767205, 7.260928025529799, 1.035062130038522, 0.219133767323475, 2.3477218614594797, 4.664571529906239, 6.819734657934211, 6.885968422731224, 1.3951984070596168, 3.09776093052776, 1.8999102403234591, 1.2071646003454783, 3.7629054760033975, 9.915353584056993, 1.3079025167940295, 4.651014857849215, 4.67138241846302, 4.608505559913361, 8.197528901787505, 9.34802184649046, 0.48638846255413704, 3.3343390532925943, 2.5173379825501563, 8.457718352327644, 0.6321390134908744, 7.242357862745466, 1.5796121127474028, 2.1381567294927315, 8.098774499074588, 7.81906300807666, 7.802112299844893, 2.1275252482989346, 8.845215918651059, 4.2785042018768245, 1.7142364431858381, 0.3988427269759043, 9.945623399456059, 8.50560861305665, 7.154676511502248, 1.684268883707889, 2.871168229828717, 1.9567647491318552, 8.264462320334092, 4.723484414130388, 4.663984522324446, 6.637070263424482, 2.993624326216131, 6.536142761078983, 5.89594552075403, 6.99207097904675, 7.721286732618591, 5.73033085585016, 0.13135631964095396, 8.561917584003668, 0.7153522214853925, 8.705018866222982, 6.319114002310639, 2.6561865233303394, 3.2453052545993213, 7.933399882237784, 2.721905197053407, 8.578167632864016, 8.787076069494578, 3.974456606291832, 3.3187585730011837, 1.0848682727014414, 1.0434422894408468, 9.296301895530785, 0.6453277780374755, 3.052947355065344, 2.0054550896582324, 5.272560646667356, 8.046616823519614, 8.064015538773031, 1.4374527376954593, 5.427126398285557, 2.969916308710153, 3.2144118628244778, 5.456156670141505, 2.006964927988273, 6.504467238202861, 0.32208641654636994, 5.2878631858259695, 1.8023235125818327, 9.632787042654108, 9.731390834276961, 8.077296537347609, 9.104626982385934, 0.3205775591314741, 2.9362663550015955, 9.11151480851601, 1.8942156350240424, 0.6290583788539972, 1.8183152878707487, 2.4906369823805683, 8.528965651443897, 8.73704593757065, 2.3605090093006478, 1.4310777260457008, 1.0593326323503671, 8.710871723338453, 7.183490470401704, 0.34716484831173067, 9.71573471334834, 5.812125898081812, 2.0083146292814247, 3.3300003790960786, 8.819384263719424, 5.573704385888194, 5.190441276501716, 3.868879184305393, 4.571296623363347, 9.042481550548379, 4.738969122159333, 4.244140974500512, 8.823800521711266, 3.8504051692201626, 4.454797384363761, 6.923490150442607, 0.7809488217270399, 9.365074066843984, 4.007612837679489, 7.281825410320629, 4.650825967031148, 1.2016393340564913, 3.9914562694266067, 1.7898957620306777, 1.5090675238977058, 6.911209918411208, 2.579062685138278, 9.694003419831398, 8.529657521315949, 1.158404922516989, 0.83167646856804, 9.337311619817513, 1.083295761724139, 0.32534729064832124, 3.9237445646090894, 8.693261479199691, 3.954124587234873, 9.010319899962516, 6.555219845883569, 0.39123519551489294, 8.059612467947975, 4.014045810584764, 8.861673648717975, 7.549235855447348, 8.869605358435788, 9.082076773672599, 1.216987793383535, 0.675769167293474, 7.126991121937155, 0.9346653456658793, 9.100496468288492, 8.9029483717664, 6.646464958651016, 7.693772130641806, 9.206329594296935, 9.919657601695937, 8.798305486791236, 0.4677206404151901, 0.3508612798101085, 6.630351699315674, 0.2546160909650863, 9.56283142247968, 8.554510356148338, 2.52870324103145, 7.408966961855471, 8.315529795739247, 6.367066431951938, 7.600968540929417, 5.341368975410354, 0.5824773737711753, 0.06807313548340299, 4.428591011548297, 2.282884974820023, 1.0136635725554122, 7.504815617878988, 2.8033924398245915, 1.0260225592149796, 3.238326749718609, 7.760571093893503, 2.5501895920023743, 7.59131539893964, 2.805945160118326, 5.294582071251015, 0.0025432849135342828, 4.212988443925422, 0.9139400358282646, 0.2976659017830796, 0.5603222615526304, 5.849415688952839, 9.560638790254293, 7.807698967408992, 3.385003796580751, 9.077809489982698, 4.3644495757438495, 5.206207312852801, 7.850128638179507, 7.332027995529474, 8.517273800717579, 9.891027427954281, 9.06243895842127, 0.5420899090130871, 2.9401791655397713, 0.07985704408007388, 3.490390746777633, 5.987058718339946, 7.325476922706379, 3.0885580837242923, 0.7648060237268905, 4.7975884194852005, 4.38442160658833, 4.414162770381064, 1.4734866793666934, 8.319604676347156, 2.6201803277300484, 7.921683169830022, 4.911815597907888, 4.885530309880362, 5.406626868230807, 3.955087108763775, 1.2976564391918044, 2.4153643220598675, 9.506699496416825, 9.441690706501753, 1.456161461369071, 7.889483979557934, 0.7226438561569604, 5.011408559810766, 6.108409926558979, 5.989106043224547, 8.882364648210686, 4.300954165404466, 7.3472054780962175, 4.75014416864322, 5.977418923686908, 5.018669739487585, 3.3249887709839774, 3.480303708364534, 5.391057941608835, 7.183038805298642, 9.356173399894518, 9.403392257785429, 9.667637419002684, 0.8928866447657213, 1.6593072103150575, 5.758177289289479, 1.2274503074145382, 8.123888635014168, 6.082446576292423, 1.812833254957683, 2.1239325651414145, 5.473839552997022, 4.351277082490982, 4.093536736695822, 8.995970801965985, 9.910370510255373, 6.039967067521552, 0.9376854545529811, 9.122603124107274, 0.7885753112277716, 1.2386549538695424, 8.979291104977268, 6.407741685213775, 2.001989050683073, 4.014207317045972, 5.803014000725561, 1.7198844000073932, 1.8298760183925955, 0.43368591100778286, 4.303357313936368, 6.465763206853449, 5.652878585328384, 4.1091681378751685, 3.643327441098566, 7.1139420486704905, 1.6888761956259668, 6.644280785784287, 2.75750400374967, 2.7751810829398305, 0.5095421734630667, 9.023869318371547, 3.415196920824044, 1.4488373591290782, 6.4917321893446545, 7.828483362217789, 7.333331027602182, 9.362468091888383, 9.508381291998687, 7.012266074433545, 2.257570779034591, 0.43618368001989594, 0.0011707965164675649, 2.120311497070313, 8.358953324744022, 2.5052137508752272, 4.357377758492048, 4.429580811600876, 1.9438005921437918, 4.186018148032707, 9.958389877821098, 5.3485657170899, 8.619066849151679, 3.5811434919010177, 3.432170461019939, 9.699608853758958, 0.9362666758686589, 8.14293315132414, 8.901113121594042, 8.756721457423595, 0.16484902262725476, 8.697342057320183, 5.703238864865202, 7.207577957649311, 2.4114226049024126, 5.484874238111367, 1.289068355846188, 3.7974282599926146, 4.439692042878265, 8.025344596352221, 1.8651332956956945, 7.7318704009816885, 6.987255544177151, 0.28747492084418624, 2.7140601724984093, 3.34795047294726, 2.7160747446988696, 7.957225438816965, 7.876201543544264, 0.7996494381406016, 3.7376393561810186, 4.267848195670072, 5.883825635059068, 0.8430159827361505, 8.549511525997673, 5.88976374342426, 2.351808266182461, 1.7631875472691094, 6.111748793203611, 3.2875417761354564, 6.8051426845297325, 7.2623087143263785, 0.7736064712215629, 5.9787758891997145, 4.671417187316974, 3.920897812461205, 1.366342685758013, 1.6314914531117541, 9.795373567220997, 7.507035221133183, 7.317508317602776, 5.535982930528497, 9.741941901611119, 3.954374136430702, 9.039127183236973, 9.508973049217065, 6.4491489264786885, 9.316893742443932, 7.672457088324895, 6.6364116352519575, 1.1265016745365464, 2.8401812602634746, 8.613310097445808, 6.183013357148375, 1.9152319661095518, 1.417137438344681, 5.372465104203111, 2.226268585444031, 1.312493081571674, 2.142292082508569, 6.14049210666876, 0.830400325834677, 7.443248112917132, 2.410297524942436, 4.321519442039476, 9.56501004238342, 1.775204778135363, 2.4030031170136046, 2.756159441580408, 1.421492033769307, 4.294999197079985, 3.4284648450283672, 8.667309212149704, 8.093182019265539, 8.980067822043367, 8.514549654175132, 3.5739982816443403, 1.719427172056004, 8.892441564387001, 5.224681081983441, 5.152037627607764, 4.911310818439398, 9.436024313424198, 5.2642082988837995, 5.829769783569042, 0.838176614406525, 0.9320157119442463, 0.9844462642947205, 8.84889272473389, 3.800760845177129, 1.9445563081502204, 7.079179745847243, 9.325492193216041, 8.584775144211962, 8.089889353668614, 1.8649863549530343, 5.909357140129511, 7.387216451719158, 3.5900323614497784, 6.365599787334909, 4.169810403295805, 1.1662314516703953, 8.432719514878983, 8.684211960293776, 8.023448578229644, 2.653934827493565, 5.5259452135804645, 9.224207106560282, 0.6765135199011496, 5.48304861603213, 7.336412034179412, 1.706336008830277, 9.386226988266513, 7.856085305079961, 0.9403597390321317, 0.5885932363757729, 6.642168514356708, 2.37039393423804, 6.849928801540831, 5.630846806202862, 7.648274818589796, 9.936336058420292, 3.726848425874505, 0.344988910705174, 8.279918694473427, 5.726914341880763, 8.045846552126843, 7.777917126265336, 2.6144716702843707, 7.356038542857611, 2.397421917585546, 3.8571518492479475};
        double alphaVals[] = new double[] {8.731367659420524, 4.953457195556284, 3.528559407466828, 6.984237675368505, 9.738392916728834, 1.785255122882082, 1.3292802044886953, 6.91847563559144, 3.9237584949456084, 2.147261860999936, 0.42645749458916193, 4.480500454817604, 4.570780196964965, 2.6476221686222767, 6.138721087990335, 6.396404117300727, 5.348907438002827, 9.738211643172853, 3.358702367287947, 9.622234126776428, 6.014474646697633, 9.944009332842839, 9.959372358066368, 0.7272709115288623};

        //readValues(betaVals, alphaVals);

        //runSimulation(betaVals, alphaVals, scale, ratio); //runs simulation 10 times
        //waitTime = network.simulate(7200, 4.339385779264273, 5.311728677228018, true);
        //System.out.println("Avg wait time: " + network.avgWaitTime);

    /*    while (size != 60) {
            double percent = scale * 100;
            System.out.println("Scale: " + scale);
            //runSimulation(betaVals, alphaVals, scale, size);
            runSimulation(betaVals, alphaVals, scale, ratio);
            //size += 5;

            if (scale != 1.0) {
                scale += 10.0;
            } else {
                scale += 9.0;
            }
        }*/
        for (int i = 0; i < 1; i++) {

            GeneticAlgorithm alg = new GeneticAlgorithm();

            alg.setMutateValue(0.045);
            alg.setFirstTerm(0.009);

            if (alg.populationSize > 10) {
                writeToFile = false;
            }
            alg.createPopulation();
            alg.calculateArithmeticFactor();
            alg.survivalOfFittest();
            System.out.println();
        }


    }

    public static double runSimulation(double betaVal[], double alphaVal[], boolean child) throws IloException, IOException { // constructor for genetic algorithm
        Network network = Network.createNetwork();
        double waitTime = 0;
        int fleetSize = 25;
        createFleet(fleetSize, network);

        if (child || !writeToFile) waitTime = network.simulate(7200, betaVal, alphaVal, false);
        else if (writeToFile) waitTime = network.simulate(7200, betaVal, alphaVal, true);

        if (network.getTotalNumberOfPassengers() < 130) { // for a fleet size of 25, at least 130 passengers must be picked to use alpha/beta values
            waitTime = -1;
        }

        /*System.out.println("Waiting List after simulation (" + waitingList.size() + ")");
        System.out.println("-----------------------------");

        if (waitingList.size() == 0) {
            System.out.println("           [Empty]           ");
        }
        System.out.println();

        for (Passenger passenger : waitingList) {
            System.out.println(passenger);
        }
        System.out.println();*/
        return waitTime;
    }

    public static void runSimulation(double betaVal[], double alphaVal[], double scale, double ratio) throws IloException, IOException { // constructor for specific fleet to passenger ratio
        double[] waitTime = new double[10];
        double[] inVehicleTravelTime = new double[10];
        double[] totalVehicleTravelTime = new double[10];
        double[] totalMilesTravelled = new double[10];
        double sumOfWaitTimes = 0;
        double sumOfInVehicleTravelTimes = 0; // for each iteration's average (for fleet)
        double sumOfTotalTravelTimes = 0;
        double sumOfMilesTravelled = 0;

        double sumOfInVehicleSeconds = 0; // raw sum for all iterations
        double sumOfTotalTravelSeconds = 0;
        double sumOfTotalDistanceTravelled = 0;
        double totalPassengers = 0;

        double standardDevWaitTime = 0;
        double standardDevInVehicleTravelTime = 0;
        double standardDevTotalVehicleTravelTime = 0;
        double standardDevMilesTravelled = 0;

        for (int i = 0; i < waitTime.length; i++) {
            Network network = Network.createNetwork(scale);
            int time = 7200;

            inVehicleTravelTime[i] = 0; // reset each iteration statistic to allow for correct addition for each vehicle in fleet
            totalVehicleTravelTime[i] = 0;
            totalMilesTravelled[i] = 0;

            int numberOfPassengers = network.getPassengers().size();
            for (Passenger passenger : network.getPassengers()) {   //number of passengers is approximately the number of people picked up + the rest on the waitinglist
                if (passenger.getDeparturetime() > time) {
                    numberOfPassengers--;
                }
            }
            int fleetSize = (int) (ratio * numberOfPassengers);
            createFleet(fleetSize, network);

            if (!writeToFile) waitTime[i] = network.simulate(time, betaVal, alphaVal, false);
            else waitTime[i] = network.simulate(7200, betaVal, alphaVal, true);

            sumOfWaitTimes += waitTime[i];
            for (Vehicle vehicle : network.getVehicleList()) {
                sumOfInVehicleSeconds += vehicle.getInVehicleTravelTime(); //sum for all iterations
                sumOfTotalTravelSeconds += vehicle.getTotalTravelTime();
                sumOfTotalDistanceTravelled += vehicle.getTotalDistanceTravelled();

                inVehicleTravelTime[i] += vehicle.getInVehicleTravelTime(); //sum per iteration
                totalVehicleTravelTime[i] += vehicle.getTotalTravelTime();
                totalMilesTravelled[i] += vehicle.getTotalDistanceTravelled();

            }
            inVehicleTravelTime[i] /= network.getTotalNumberOfPassengers(); //divide by number of passengers to get average per iteration
            totalVehicleTravelTime[i] /= network.getTotalNumberOfPassengers();
            totalMilesTravelled[i] /= network.getVehicleList().size();

            sumOfInVehicleTravelTimes += inVehicleTravelTime[i]; //sum the averages for each iteration to calculate standard deviation
            sumOfTotalTravelTimes += totalVehicleTravelTime[i];
            sumOfMilesTravelled += totalMilesTravelled[i];

            totalPassengers += network.getTotalNumberOfPassengers();
        }

        double avgWaitTime = sumOfWaitTimes / waitTime.length;

        double avgInVehicleTravelTime = sumOfInVehicleTravelTimes / waitTime.length; //average the averages from each iteration
        double avgTotalTravelTime = sumOfTotalTravelTimes / waitTime.length;
        double avgTotalMilesTravelled = sumOfMilesTravelled / waitTime.length;

        for (int i = 0; i < waitTime.length; i++) {
            standardDevWaitTime += Math.pow(waitTime[i] - avgWaitTime, 2);
            standardDevInVehicleTravelTime += Math.pow(inVehicleTravelTime[i] - avgInVehicleTravelTime, 2);
            standardDevTotalVehicleTravelTime += Math.pow(totalVehicleTravelTime[i] - avgTotalTravelTime, 2);
            standardDevMilesTravelled += Math.pow(totalMilesTravelled[i] - avgTotalMilesTravelled, 2);
        }
        standardDevWaitTime = Math.sqrt(standardDevWaitTime / waitTime.length);
        standardDevInVehicleTravelTime = Math.sqrt(standardDevInVehicleTravelTime / waitTime.length);
        standardDevTotalVehicleTravelTime = Math.sqrt(standardDevTotalVehicleTravelTime / waitTime.length);
        standardDevMilesTravelled = Math.sqrt(standardDevMilesTravelled / waitTime.length);

        //System.out.println("Average Wait Time | Average in-vehicle travel time (per passenger) | Average total vehicle travel time (per passenger) | Total miles travelled in fleet);
        System.out.println(avgWaitTime + " " + (sumOfInVehicleSeconds / totalPassengers) + " " + (sumOfTotalTravelSeconds / totalPassengers) + " " + sumOfTotalDistanceTravelled);
        System.out.println(standardDevWaitTime + " " + standardDevInVehicleTravelTime + " " + standardDevTotalVehicleTravelTime + " " + standardDevMilesTravelled);
    }

    public static void runSimulation(double betaVal[], double alphaVal[], double scale, int size) throws IloException, IOException { // constructor for specific fleet size

        int time = 7200;
        double[] waitTime = new double[10];
        double[] inVehicleTravelTime = new double[10];
        double[] passengersPicked = new double[10];
        double[] passengersNotPicked = new double[10];
        double sumOfWaitTimes = 0;
        double sumOfInVehicleTravelTimes = 0;
        double waitTimeSum = 0;
        int vehicleSum = 0;
        double sumOfPassengersNotPicked = 0;
        double sumOfInVehicleSeconds = 0;
        double totalNumberOfPassengers = 0;
        double standardDevWaitTime = 0;
        double standardDevInVehicleTravelTime = 0;
        double standardDevPassengersPicked = 0;
        double standardDevPassengersNotPicked = 0;
        int fleetSize = size;

        for (int i = 0; i < waitTime.length; i++) {

            Network network = Network.createNetwork(scale);
            createFleet(fleetSize, network);

            inVehicleTravelTime[i] = 0;

            if (!writeToFile) waitTime[i] = network.simulate(time, betaVal, alphaVal, false);
            else waitTime[i] = network.simulate(7200, betaVal, alphaVal, true);

            for (Vehicle vehicle : network.getVehicleList()) {
                sumOfInVehicleSeconds += vehicle.getInVehicleTravelTime();
                inVehicleTravelTime[i] += vehicle.getInVehicleTravelTime();
            }
            inVehicleTravelTime[i] /= network.getTotalNumberOfPassengers();
            sumOfInVehicleTravelTimes += inVehicleTravelTime[i];
            passengersPicked[i] += network.getTotalNumberOfPassengers();
            passengersNotPicked[i] += network.getWaitingList().size();
            totalNumberOfPassengers += network.getTotalNumberOfPassengers();
            sumOfWaitTimes += waitTime[i];
            waitTimeSum += network.getSumOfWaitTimes();
            vehicleSum += network.getNumberOfUsedVehicles();
            sumOfPassengersNotPicked += network.getWaitingList().size();
        }

        double avgWaitTime = sumOfWaitTimes / waitTime.length;
        double avgInVehicleTravelTime = sumOfInVehicleTravelTimes / waitTime.length;
        double avgNumberPicked = totalNumberOfPassengers / waitTime.length;
        double avgNumberNotPicked = sumOfPassengersNotPicked / waitTime.length;

        for (int i = 0; i < waitTime.length; i++) {
            standardDevWaitTime += Math.pow(waitTime[i] - avgWaitTime, 2);
            standardDevInVehicleTravelTime += Math.pow(inVehicleTravelTime[i] - avgInVehicleTravelTime, 2);
            standardDevPassengersPicked += Math.pow(passengersPicked[i] - avgNumberPicked, 2);
            standardDevPassengersNotPicked += Math.pow(passengersNotPicked[i] - avgNumberNotPicked, 2);

        }
        standardDevWaitTime = Math.sqrt(standardDevWaitTime / waitTime.length);
        standardDevInVehicleTravelTime = Math.sqrt(standardDevInVehicleTravelTime / waitTime.length);
        standardDevPassengersPicked = Math.sqrt(standardDevPassengersPicked / waitTime.length);
        standardDevPassengersNotPicked = Math.sqrt(standardDevPassengersNotPicked / waitTime.length);


        System.out.println("Average Wait Time: " + avgWaitTime);
        System.out.println("Average in-vehicle travel time: " + (sumOfInVehicleSeconds / totalNumberOfPassengers));
        System.out.println("Average # of Passengers Picked: " + avgNumberPicked);
        System.out.println("Average # of Passengers Not Picked: " + avgNumberNotPicked);
        System.out.println(standardDevWaitTime + " " + standardDevInVehicleTravelTime + " " + standardDevPassengersPicked + " " + standardDevPassengersNotPicked);
    }

    private static void createFleet (int size, Network network) {
        ArrayList<Vehicle> fleet = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            fleet.add(network.makeVehicle(network));
        }

    }

    private static void readValues (double betaVals[], double alphaVals[]) throws IOException {
        Network network = new Network();
        network.createNetwork();
        System.out.println("Alpha Values");
        for (int i = 0; i < alphaVals.length; i++) {
            System.out.println(network.mainNodesList.get(i).getId() + ": " + alphaVals[i]);
        }
        System.out.println();

        System.out.println("Beta Values");
        int iterator = 0;
        for (int i = 0; i < network.mainNodesList.size(); i++) {
            for (int j = 0; j < network.mainNodesList.size(); j++) {
                System.out.println(network.mainNodesList.get(i).getId() + " to " + network.mainNodesList.get(j).getId() + ": " + betaVals[iterator]);
                iterator++;
            }
        }
    }
}
