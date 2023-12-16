public class Chapter1_self_test {
/*

 9.The moon's gravity is about 17 percent that of earth's.
 Write a program that computes your effective weight on the moon.

 */
public static void main(String[] args) {
    double earthweight;
    double moonweight;
    earthweight = 60;
    moonweight = earthweight * 0.17;
    System.out.println(earthweight + " earth-kg is equivalent to " + moonweight + " moon-kg");
    //60.0 earth-kg is equivalent to 10.200000000000001 moon-kg







/*
10.Adapt to try thus 1-2 so that it prints a conversation table of inches to meters.
Display 12 feet(1 feet = 12 inches) of conversations, inch by inch. output a blank line every 12 inches.
(one meter equals approximately 39.37 inches)
*/
double inches, meters;
int counter;
counter = 0;
    for (inches = 1;  inches <= 144 ; inches++) {
        meters = inches/39.37;
        System.out.println(inches + " inches is " + meters + "meters");
counter++;
if (counter == 12) {
    System.out.println();
    counter = 0;
}

    }

/*

1.0 inches is 0.025400050800101603meters
2.0 inches is 0.05080010160020321meters
3.0 inches is 0.07620015240030481meters
4.0 inches is 0.10160020320040641meters
5.0 inches is 0.12700025400050802meters
6.0 inches is 0.15240030480060962meters
7.0 inches is 0.17780035560071122meters
8.0 inches is 0.20320040640081283meters
9.0 inches is 0.2286004572009144meters
10.0 inches is 0.25400050800101603meters
11.0 inches is 0.27940055880111764meters
12.0 inches is 0.30480060960121924meters

13.0 inches is 0.33020066040132084meters
14.0 inches is 0.35560071120142245meters
15.0 inches is 0.38100076200152405meters
16.0 inches is 0.40640081280162565meters
17.0 inches is 0.43180086360172726meters
18.0 inches is 0.4572009144018288meters
19.0 inches is 0.4826009652019304meters
20.0 inches is 0.5080010160020321meters
21.0 inches is 0.5334010668021336meters
22.0 inches is 0.5588011176022353meters
23.0 inches is 0.5842011684023368meters
24.0 inches is 0.6096012192024385meters

25.0 inches is 0.63500127000254meters
26.0 inches is 0.6604013208026417meters
27.0 inches is 0.6858013716027432meters
28.0 inches is 0.7112014224028449meters
29.0 inches is 0.7366014732029464meters
30.0 inches is 0.7620015240030481meters
31.0 inches is 0.7874015748031497meters
32.0 inches is 0.8128016256032513meters
33.0 inches is 0.8382016764033529meters
34.0 inches is 0.8636017272034545meters
35.0 inches is 0.8890017780035561meters
36.0 inches is 0.9144018288036576meters

37.0 inches is 0.9398018796037593meters
38.0 inches is 0.9652019304038608meters
39.0 inches is 0.9906019812039625meters
40.0 inches is 1.0160020320040641meters
41.0 inches is 1.0414020828041657meters
42.0 inches is 1.0668021336042672meters
43.0 inches is 1.0922021844043688meters
44.0 inches is 1.1176022352044706meters
45.0 inches is 1.143002286004572meters
46.0 inches is 1.1684023368046736meters
47.0 inches is 1.1938023876047752meters
48.0 inches is 1.219202438404877meters

49.0 inches is 1.2446024892049785meters
50.0 inches is 1.27000254000508meters
51.0 inches is 1.2954025908051816meters
52.0 inches is 1.3208026416052834meters
53.0 inches is 1.346202692405385meters
54.0 inches is 1.3716027432054865meters
55.0 inches is 1.397002794005588meters
56.0 inches is 1.4224028448056898meters
57.0 inches is 1.4478028956057913meters
58.0 inches is 1.4732029464058929meters
59.0 inches is 1.4986029972059944meters
60.0 inches is 1.5240030480060962meters

61.0 inches is 1.5494030988061978meters
62.0 inches is 1.5748031496062993meters
63.0 inches is 1.6002032004064008meters
64.0 inches is 1.6256032512065026meters
65.0 inches is 1.6510033020066042meters
66.0 inches is 1.6764033528067057meters
67.0 inches is 1.7018034036068073meters
68.0 inches is 1.727203454406909meters
69.0 inches is 1.7526035052070106meters
70.0 inches is 1.7780035560071121meters
71.0 inches is 1.8034036068072137meters
72.0 inches is 1.8288036576073152meters

73.0 inches is 1.854203708407417meters
74.0 inches is 1.8796037592075185meters
75.0 inches is 1.90500381000762meters
76.0 inches is 1.9304038608077216meters
77.0 inches is 1.9558039116078234meters
78.0 inches is 1.981203962407925meters
79.0 inches is 2.0066040132080265meters
80.0 inches is 2.0320040640081283meters
81.0 inches is 2.0574041148082296meters
82.0 inches is 2.0828041656083314meters
83.0 inches is 2.108204216408433meters
84.0 inches is 2.1336042672085345meters

85.0 inches is 2.1590043180086362meters
86.0 inches is 2.1844043688087376meters
87.0 inches is 2.2098044196088393meters
88.0 inches is 2.235204470408941meters
89.0 inches is 2.2606045212090424meters
90.0 inches is 2.286004572009144meters
91.0 inches is 2.311404622809246meters
92.0 inches is 2.3368046736093473meters
93.0 inches is 2.362204724409449meters
94.0 inches is 2.3876047752095504meters
95.0 inches is 2.413004826009652meters
96.0 inches is 2.438404876809754meters

97.0 inches is 2.4638049276098553meters
98.0 inches is 2.489204978409957meters
99.0 inches is 2.514605029210059meters
100.0 inches is 2.54000508001016meters
101.0 inches is 2.565405130810262meters
102.0 inches is 2.590805181610363meters
103.0 inches is 2.616205232410465meters
104.0 inches is 2.6416052832105668meters
105.0 inches is 2.667005334010668meters
106.0 inches is 2.69240538481077meters
107.0 inches is 2.717805435610871meters
108.0 inches is 2.743205486410973meters

109.0 inches is 2.7686055372110747meters
110.0 inches is 2.794005588011176meters
111.0 inches is 2.819405638811278meters
112.0 inches is 2.8448056896113796meters
113.0 inches is 2.870205740411481meters
114.0 inches is 2.8956057912115827meters
115.0 inches is 2.921005842011684meters
116.0 inches is 2.9464058928117858meters
117.0 inches is 2.9718059436118875meters
118.0 inches is 2.997205994411989meters
119.0 inches is 3.0226060452120906meters
120.0 inches is 3.0480060960121924meters

121.0 inches is 3.0734061468122937meters
122.0 inches is 3.0988061976123955meters
123.0 inches is 3.124206248412497meters
124.0 inches is 3.1496062992125986meters
125.0 inches is 3.1750063500127004meters
126.0 inches is 3.2004064008128017meters
127.0 inches is 3.2258064516129035meters
128.0 inches is 3.2512065024130052meters
129.0 inches is 3.2766065532131066meters
130.0 inches is 3.3020066040132083meters
131.0 inches is 3.3274066548133097meters
132.0 inches is 3.3528067056134114meters

133.0 inches is 3.378206756413513meters
134.0 inches is 3.4036068072136145meters
135.0 inches is 3.4290068580137163meters
136.0 inches is 3.454406908813818meters
137.0 inches is 3.4798069596139194meters
138.0 inches is 3.505207010414021meters
139.0 inches is 3.5306070612141225meters
140.0 inches is 3.5560071120142243meters
141.0 inches is 3.581407162814326meters
142.0 inches is 3.6068072136144274meters
143.0 inches is 3.632207264414529meters
144.0 inches is 3.6576073152146305meters


*/

}
}
