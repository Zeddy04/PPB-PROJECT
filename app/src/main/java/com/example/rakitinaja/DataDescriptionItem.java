package com.example.rakitinaja;

import com.example.rakitinaja.model.BestModel;

import java.util.ArrayList;

public class DataDescriptionItem {

    private static final String[] productName =  {
            "Processor AMD Ryzen™ 7 5800X Desktop Processors",
            "Processor Intel Core i7 12700KF",
            "vga GEFORCE GTX 1650",
            "vga GEFORCE GTX 1650",
            "Motherboard ASUS PRIME H310M-D",
            "Motherboard Asus TUF Gaming B550M-Plus (WI-FI)",
            "Motherboard MSI A320M-A Pro MAX",
            "PSU Corsair rm650x",
            "RAM DOMINATOR PLATINUM RGB 16GB (2 x 8GB) DDR4 DRAM 3200MHz C16 Memory Kit",
            "RAM Kingston FURY BEAST RAM DIMM 16GB 3200MHz DDR4 (Kit of 2) RGB",
            "Gigabyte Aorus Geforce RTX 3080 10GB GDDR6X",
            "Gigabyte Radeon RX 6900 XT Gaming OC 16G Graphics Card",                
            "Gigabyte Radeon RX 6600 XT Eagle 8G GDDR6",
            "Gigabyte Geforce RTX 3090 Gaming 24GB GDDR6X",
            "Gigabyte AORUS Radeon RX 6900 XT XTREME WATERFORCE WB 16GB GDDR6",
            "Gigabyte Z690 AORUS PRO LGA1700 12th Gen Motherboard",
            "Gigabyte B550M DS3H AC Motherboard",
            "Gigabyte X570 UD Motherboard",
            "GIGABYTE Z590 AORUS MASTER Motherboard",
            "Asus ROG Thor 850W 80+ Platinum Fully Modular Power Supply",
            "Corsair HX1200i 1200W 80+ Platinum Fully Modular Power Supply",
            "Gigabyte P550B 550W 80 PLUS Bronze Certified Power Supply",
            "Silverstone Strider Gold S ST85F-GS 850W 80+ Gold Fully Modular Power Supply",

    };

    private static final String[] priceProduct ={
            "Rp 6.390.000,-",
            "Rp 7.200.000,-",
            "Rp 5.508.000,-",
            "Rp 6.254.000,-",
            "Rp 1.050.000,-",
            "Rp 2.750.000,-",
            "Rp 820.000,-",
            "Rp 1.868.600,-",
            "Rp 1.650.000,-",
            "Rp 1.420.000,-",
            "Rp 16.600.000,-",
            "Rp 28.000.000,-",
            "Rp 11.299.900,-",
            "Rp 25.800.000,-",
            "Rp 28.810.000,-",
            "Rp 5.990.000,-",
            "Rp 1.350.000,-",
            "Rp 2.860.000,-",
            "Rp 6.200.000,-",
            "Rp 4.329.000,-",
            "Rp 4.945.000,-",
            "Rp 669.000,-",
            "Rp 1.430.000-",
 
            
    };

    private static final int[] imgProduct = {
            R.drawable.ryzen,
            R.drawable.intel,
            R.drawable.gtx1650,
            R.drawable.gtx1660super,
            R.drawable.asusprime,
            R.drawable.asustuf,
            R.drawable.msi320,
            R.drawable.psucorsair,
            R.drawable.ramdominator1,
            R.drawable.ramdominator2,
            R.drawable.ramkingston
            R.drawable.GigabyteAorusGeforceRTX308010GBGDDR6X
            R.drawable.GigabyteRadeonRX6900XTGamingOC16GGraphicsCard
            R.drawable.GigabyteRadeonX6600XTEagle8GGDDR6
            R.drawable.GigabyteGeforceRTX3090Gaming4GBGDDR6X
            R.drawable.GigabyteAORUSRadeonRX6900XTXTREMEWATERFOCEWB16GBGDDR6
            R.drawable.GigabyteZ690AORUSPROLGA170012thGenMotherboard
            R.drawable.GigabyteB550MDS3HACMotherboard
            R.drawable.GigabyteX570UDMotherboard
            R.drawable.GIGABYTEZ590AORUSMASTERMotherboard
            R.drawable.AsusROGThor850W80PlatinumFullyModularPowerSupply
            R.drawable.CorsairHX1200i1200W80PlatinumFullyModularPowerSupply
            R.drawable.GigabyteP550B550W80PLUSBronzeCertifiedPowerSupply
            R.drawable.SilverstoneStriderGoldSST85FGS850W80GoldFullyModularPowerSupply

    };

    public static String[] descProduct = {
             "8 cores optimized for high-FPS gaming rigs.\n" +
                "\n" +
                "General Specifications\n" +
                "Platform : Boxed Processor\n" +
                "Product Family : AMD Ryzen™ Processors\n" +
                "Product Line : AMD Ryzen™ 7 Desktop Processors\n" +
                "# of CPU Cores : 8\n" +
                "# of Threads : 16\n" +
                "Max. Boost Clock : Up to 4.7GHz\n" +
                "Base Clock : 3.8GHz\n" +
                "Total L2 Cache : 4MB\n" +
                "Total L3 Cache : 32MB\n" +
                "Default TDP : 105W\n" +
                "Processor Technology for CPU Cores : TSMC 7nm FinFET\n" +
                "Unlocked for Overclocking : Yes\n" +
                "CPU Socket : AM4\n" +
                "Thermal Solution (PIB) : Not included\n" +
                "Max. Operating Temperature (Tjmax) : 90°C\n" +
                "Launch Date : 11/5/2020\n" +
                "*OS Support : \tWindows 10 - 64-Bit Edition\n" +
                "\t\tRHEL x86 64-Bit\n" +
                "\t\tUbuntu x86 64-Bit\n" +
                "\t\t*Operating System (OS) support will vary by manufacturer\n",
            "Total Cores : 12\n" +
                "# of Performance-cores : 8\n" +
                "# of Efficient-cores : 4\n" +
                "Total Threads : 20\n" +
                "Max Turbo Frequency : 5.00 GHz\n" +
                "Intel® Turbo Boost Max Technology 3.0 Frequency : 5.00 GHz\n" +
                "Performance-core Max Turbo Frequency : 4.90 \n" +
                "Efficient-core Max Turbo Frequency : 3.80 GHz\n" +
                "Performance-core Base Frequency : 3.60 GHz\n" +
                "Efficient-core Base Frequency : 2.70 GHz\n" +
                "Cache : 25 MB Intel® Smart Cache\n" +
                "Total L2 Cache : 12 MB\n" +
                "Processor Base Power : 125 W\n" +
                "Maximum Turbo Power : 190 W\n" +
                "\n" +
                "Memory Specifications :\n" +
                "Max Memory Size (dependent on memory type) : 128 GB\n" +
                "Memory Types :\n" +
                "Up to DDR5 4800 MT/s\n" +
                "Up to DDR4 3200 MT/s\n" +
                "Max # of Memory Channels : 2\n" +
                "Max Memory Bandwidth : 76.8 GB/s\n" +
                "\n" +
                "Expansion Options\n" +
                "Direct Media Interface (DMI) Revision : 4.0\n" +
                "Max # of DMI Lanes : 8\n" +
                "Scalability : 1S Only\n" +
                "PCI Express Revision : 5.0 and 4.0\n" +
                "PCI Express Configurations : Up to 1x16+4, 2x8+4\n" +
                "Max # of PCI Express Lanes : 20\n",
            "Tipe : Gigabyte GeForce GTX 1650 D6 OC 4G (rev. 3.0) 4GB GDDR6 GV-N1656OC-4GD 3.0.\n" +
                "Powered by GeForce® GTX 1650\n" +
                "NVIDIA Turing™ architecture and GeForce Experience™\n" +
                "Integrated with 4GB GDDR6 128bit memory interface\n" +
                "90mm unique blade fan\n" +
                "172 mm compact card size\n" +
                "1635 MHz (Reference Card: 1590 MHz)\n" +
                "\n" +
                "Graphics Processing : GeForce® GTX 1650\n" +
                "Core Clock1635 MHz (Reference Card: 1590 MHz)\n" +
                "CUDA® Cores : 896\n" +
                "Memory Clock : 12000 MHz\n" +
                "Memory Size : 4 GB\n" +
                "Memory Type : GDDR6\n" +
                "Memory Bus : 128 bit\n" +
                "Memory Bandwidth (GB/sec) : 192 GB/s\n" +
                "Card Bus : PCI-E 3.0 x 16\n" +
                "Digital max resolution : 7680x4320\n" +
                "Multi-view : 3\n" +
                "Card size : L=172 W=122 H=40 mm\n" +
                "PCB Form : ATX\n" +
                "DirectX : 12\n" +
                "OpenGL : 4.6\n" +
                "NVIDIA Encoder (NVENC) : Yes (Turing)\n" +
                "Recommended PSU : 300W\n" +
                "Power Connectors : 6 Pin*1\n" +
                "Output : DisplayPort 1.4 *1, HDMI 2.0b *1, DVI-D *1\n" +
                "SLI Support : No\n" +
                "Accessories : Quick guide\n",
            "MODEL NAME : GeForce® GTX 1660 SUPER™ VENTUS OC\n" +
                "\n" +
                "GRAPHICS PROCESSING UNIT : NVIDIA® GeForce® GTX 1660 SUPER™\n" +
                "INTERFACE : PCI Express x16 3.0\n" +
                "CORES : 1408Units\n" +
                "CORE CLOCKS : Boost:1815MHz\n" +
                "MEMORY SPEED : 14 Gbps\n" +
                "MEMORY : 6GB GDDR6\n" +
                "MEMORY BUS : 192-bit\n" +
                "OUTPUT : DisplayPort x 3 (v1.4a), HDMI x 1(Supports 4K@60Hz as specified in HDMI 2.0b)\n" +
                "HDCP SUPPORT : 2.2\n" +
                "POWER CONSUMPTION : 125 W\n" +
                "POWER CONNECTORS : 8-pin x 1\n" +
                "RECOMMENDED PSU : 450 W\n" +
                "CARD DIMENSION (MM) : 231x 128 x 42 mm\n" +
                "WEIGHT (CARD / PACKAGE) : 718 g / 1198 g\n" +
                "DIRECTX VERSION SUPPORT : 12 API\n" +
                "OPENGL VERSION SUPPORT : 4.6\n" +
                "MAXIMUM DISPLAYS : 4\n" +
                "VR READY : Y\n" +
                "G-SYNC® TECHNOLOGY : Y\n" +
                "DIGITAL MAXIMUM RESOLUTION : 7680x4320\n",
            "ASUS PRIME H310M-D\n" +
                "\n" +
                "Tahun Rilis    : 2019\n" +
                "Tipe Socket 	: Intel Socket 1151\n" +
                "Form Factor 	: mATX Form Factor\n" +
                "Tipe Chipset 	: Intel H310\n" +
                "Slot RAM 	: 2 x DIMM, Max. 32GB, DDR4 2666/2400/2133 MHz Non-ECC\n" +
                "Audio Chip 	: Front panel audio connector(s) (AAFP)\n" +
                "Tipe dan Jumlah USB 	: 4 x USB 3.1 & 6 x USB 2.0/1.1\n" +
                "fitur tambahan 	: Intel 14 nm CPU,Intel Extreme Memory Profile (XMP) productnation\n",
            "AMD AM4 Socket for AMD Ryzen™ 5000 Series/ 5000 G-Series/ 4000 G-Series/ 3000 Series Desktop Processors ** Refer to www.asus.com for CPU support list",
                "Chipset : AMD B550\n" +
                "Memory  : 4 x DIMM, Max. 128GB, DDR4 4866(O.C)/4800(O.C.)/4600(O.C)/4466(O.C.)/4400(O.C)/4333(O.C.)/4266(O.C.)/4200(O.C.)/4133(O.C.)/4000(O.C.)/3866(O.C.)/3733(O.C.)/3600(O.C.)/3466(O.C.)/3400(O.C.)/3333(O.C.)/3200/3000/2933/2800/2666/2400/2133 MHz Un-buffered Memory *\n" +
                "Dual Channel Memory Architecture : ECC Memory (ECC mode) support varies by CPU.\n" +
                "Graphic : \n" +
                "1  x DisplayPort 1.2\n" +
                "1  x HDMI 2.1(4K@60HZ)\n" +
                "*Graphics specifications may vary between CPU types.\n" +
                "Multi-GPU Support\n" +
                "Supports AMD 2-Way CrossFireX Technology\n" +
                "Expansion Slots\n" +
                "AMD Ryzen™ 5000 Series/ 3000 Series Desktop Processors\n" +
                "1 x PCIe 4.0 x16 (x16 mode)\n" +
                "AMD Ryzen™ 5000 G-Series/ 4000 G-Series Desktop Processors\n" +
                "1 x PCIe 3.0 x16 (x16 mode)\n" +
                "AMD B550 Chipset\n" +
                "1 x PCIe 3.0 x16 (x4 mode) *1\n" +
                "1 x PCIe 3.0 x1 *1\n" +
                "* Support PCIe bifurcation for RAID on CPU function.\n" +
                "Storage :\n" +
                "Total supports 2 x M.2 slot(s) and 4 x SATA 6Gb/s ports\n" +
                "AMD Ryzen™ 5000 Series/ 3000 Series Desktop Processors :\n" +
                "1 x M.2_1 socket 3, with M Key, Type 2242/2260/2280 (PCIE 4.0 x4 and SATA modes) storage devices support\n" +
                "AMD Ryzen™ 5000 G-Series/ 4000 G-Series Desktop Processors :\n" +
                "1 x M.2_1 socket 3, with M Key, Type 2242/2260/2280 (PCIE 3.0 x4 and SATA modes) storage devices support\n" +
                "AMD B550 Chipset :\n" +
                "1 x M.2_2 socket 3, with M Key, Type 2242/2260/2280/22110(PCIE 3.0 x4 and SATA modes) storage devices support\n" +
                "4 x SATA 6Gb/s port(s),\n" +
                "Support Raid 0, 1, 10\n" +
                "LAN :\n" +
                "Realtek RTL8125B 2.5Gb Ethernet\n" +
                "TUF LANGuard\n" +
                "Wireless Data Network\n" +
                "Intel® Wi-Fi 6 AX200\n" +
                "2x2 Wi-Fi 6 (802.11 a/b/g/n/ac/ax) support 1024QAM/OFDMA/MU-MIMO\n" +
                "Supports up to 2.4Gbps max data rate\n" +
                "Supports dual band frequency 2.4/5 GHz\n" +
                "Supports channel bandwidth: HT20/HT40/HT80/HT160\n" +
                "Supports PCIe interface\n",
            "MSI A320M-A Pro MAX\n" +
                "\n" +
                "SOCKET : AM4\n" +
                "CPU (MAX SUPPORT) : RYZEN\n" +
                "CHIPSET : AMD® A320 Chipset\n" +
                "DDR4 MEMORY :\n" +
                "1866/ 2133/ 2400/ 2667Mhz (by JEDEC)\n" +
                "2667/ 2800/ 2933/ 3000/ 3066/ 3200 MHz (by A-XMP OC MODE)\n" +
                "MEMORY CHANNEL : Dual\n" +
                "DIMM SLOTS : 2\n" +
                "MAX MEMORY (GB) : 32\n" +
                "PCI-E X16 : 1\n" +
                "PCI-E GEN : Gen3\n" +
                "PCI-E X1 : 1\n" +
                "SATAIII : 4\n" +
                "M.2 SLOT : 1\n" +
                "RAID : 0/1/10\n" +
                "TPM (HEADER) : 1\n" +
                "LAN : 1x Realtek® 8111H\n" +
                "USB 3.2 PORTS (FRONT) : 2(Gen1, Type A)\n" +
                "USB 3.2 PORTS (REAR) : 4(Gen1, Type A)\n" +
                "USB 2.0 PORTS (FRONT) : 4\n" +
                "USB 2.0 PORTS (REAR) : 2\n" +
                "SERIAL PORTS(FRONT) : 1\n" +
                "AUDIO PORTS (REAR) : Realtek® ALC892 Codec\n" +
                "DVI-D : 1\n" +
                "HDMI : 1\n" +
                "DIRECTX : 12\n" +
                "FORM FACTOR : m-ATX\n" +
                "OPERATING SYSTEM :\n" +
                "Support for Windows® 10 64-bit\n" +
                "Support for Windows® 7 64-bit\n" +
                "* To support Windows® 7 64-bit, you must install an AMD Pinnacle Ridge & Summit Ridge CPU\n",
            "CORSAIR RM650x Series fully modular power supplies with EPS12V connectors are built with the highest quality components to deliver 80 PLUS Gold efficient power to your PC, with virtually silent operation.\n" +
                "\n" +
                "Weight 1.5\n" +
                "Adjustable Single/Multi 12V Rail : No\n" +
                "ATX Connector 1\n" +
                "ATX12V Version v2.4\n" +
                "Continuous output rated temperature C 50°C\n" +
                "Continuous power W 650 Watts\n" +
                "Fan bearing technology Magnetic Levitation Bearing\n" +
                "Fan size mm 135mm\n" +
                "MTBF hours 100,000 hours\n" +
                "Multi-GPU ready Yes\n" +
                "Warranty Ten Years\n" +
                "80 PLUS Efficiency 80 PLUS Gold Certified\n" +
                "PSU Form Factor ATX\n" +
                "iCUE Compatibility No\n" +
                "Zero RPM Mode Yes\n" +
                "EPS12V Connector 2\n" +
                "EPS12V Version v2.92\n" +
                "Modular Fully Modular\n" +
                "PCIe Connector 4\n" +
                "SATA Connector 7\n" +
                "Special Technology Magnetic Levitation Fan\n" +
                "Protections OVP (Over Voltage)\n" +
                "UVP (Under Voltage)\n" +
                "SCP (Short Circuit)\n" +
                "OTP (Over Temp)\n" +
                "OPP (Over Power)\n",
            "DOMINATOR PLATINUM RGB 16GB (2 x 8GB) DDR4 DRAM 3200MHz C16 Memory Kit.\n" +
                "Memory size: 32GB Kit (2 x 16GB)\n" +
                "Memory type: DDR4\n" +
                "SPD speed: 2133MHz\n" +
                "Speed rating: PC4-25600 (3200MHz)\n" +
                "Tested voltage: 1.35V\n", 
            "Kingston FURY BEAST RAM DIMM 16GB 3200MHz DDR4 (Kit of 2) RGB.\n" +
                "Antarmuka: DDR4\n" +
                "Kapasitas: 16GB\n" +
                "Garansi: seumur hidup\n" +
                "\n" +
                "Cahaya RGB yang bisa dikustomisasi.\n" +
                "Teknologi Sinkronisasi Infra Merah Kingston FURY.\n" +
                "Plug N Play – Overclock otomatis hingga 3200 MHz.\n" +
                "Dioptimalkan untuk Intel XMP dan AMD Ryzen\n", 
            "Gigabyte Aorus Geforce RTX 3080 10GB GDDR6X\n" +
                "\n" +
                "The GeForce RTX™ 3080 delivers the ultra performance that gamers crave\n" +
                "Powered by Ampere—NVIDIA’s 2nd gen RTX architecture\n" +
                "It’s built with enhanced RT Cores and Tensor Cores\n" +
                "New streaming multiprocessors\n" +
                "Superfast G6X memory for an amazing gaming experience\n",
            "Gigabyte Radeon RX 6900 XT Gaming OC 16G Graphics Card\n" +
                "\n" +
                "Powered by RDNA2 Radeon™ RX 6900 XT\n" +
                "Integrated with 16GB GDDR6 256-bit memory interface\n" +
                "WINDFORCE 3X Cooling System with alternate spinning fans\n" +
                "Boost Clock : up to 2285 MHz (Reference card: 2250 MHz)\n" +
                "Game Clock : up to 2050 MHz (Reference card: 2015 MHz)\n" +
                "Graphene nano lubricant\n" +
                "RGB Fusion 2.0\n" +
                "Dual BIOS\n" +
                "Protection metal back plate\n",
            "Gigabyte Radeon RX 6600 XT Eagle 8G GDDR6\n" +
                "\n" +
                "Powered by AMD RDNA 2 Radeon RX 6600XT\n" +
                "Integrated with 8GB GDDR6 128-bit memory interface\n" +
                "WINDFORCE 3X Cooling System with alternate spinning fans\n" +
                "Screen Cooling\n" +
                "2x DisplayPort 1.4a\n" +
                "2x HDMI 2.1\n" +
                "Graphene nano lubricant\n" +
                "RGB Fusion 2.0\n" +
                "Protection metal backplate\n",
            "Gigabyte Geforce RTX 3090 Gaming 24GB GDDR6X\n" +
                "\n" +
                "The GeForce RTX™ 3090 is a big ferocious GPU (BFGPU) with TITAN class performance\n" +
                "It’s powered by Ampere—NVIDIA’s 2nd gen RTX architecture—doubling down on ray tracing\n" +
                "AI performance with enhanced Ray Tracing (RT) Cores\n" +
                "Tensor Cores\n" +
                "New streaming multiprocessors\n" +
                "It features a staggering 24 GB of G6X memory\n" +
                "All to deliver the ultimate gaming experience\n",
            "Gigabyte AORUS Radeon RX 6900 XT XTREME WATERFORCE WB 16GB GDDR6\n" +
                "\n" +
                "Powered by RDNA2 Radeon™ RX 6900 XT\n" +
                "Integrated with 16GB GDDR6 256-bit memory interface\n" +
                "WATERFORCE Water Block cooling system\n" +
                "Leak detection\n" +
                "RGB Fusion 2.0\n" +
                "Protection metal back plate\n" +
                "Boost Clock : up to 2525 MHz (Reference card: 2435 MHz)\n" +
                "Game Clock : up to 2375 MHz (Reference card: 2250 MHz)\n",
            "Gigabyte Z690 AORUS PRO LGA1700 12th Gen Motherboard\n" +
                "\n" +
                "Intel LGA 1700 Socket: Supports 12th Gen Intel Core Series Processors\n" +
                "DDR4 Compatible: Dual Channel Non-ECC Unbuffered DDR4\n" +
                "Commanding Power Design: 16+1+2 Digital VRM Design with 70A Power Stage with Tantalum Polymer Capacitors\n" +
                "Cutting-Edge Thermal Design: Fully Covered Thermal Design and High Coverage MOSFET Heatsinks\n" +
                "Enlarged Thermal Guards, Next Gen Connectivity: PCIe 5.0. Quad NVMe PCIe 4.0 x4 M.2\n" +
                "SuperSpeed USB 3.2 Gen 2×2 Type-C\n" +
                "Fast Networking: 2.5 GbE LAN\n" +
                "WiFi 6 802.11ax\n" +
                "AMP-UP Audio with ALC1220 and WIMA Audio Capacitors\n" +
                "Fine Tuning Features: RGB FUSION 2.0\n" +
                "Supports Addressable LED & RGB LED Strips\n" +
                "Smart Fan 6, Q-Flash Plus Update BIOS without installing CPU\n",
            "Gigabyte B550M DS3H AC Motherboard\n" +
                "\n" +
                "Supports AMD Ryzen™ 5000 Series/ 3rd Gen Ryzen™ and 3rd Gen Ryzen™ with Radeon™ Graphics Processors\n" +
                "Dual Channel ECC/ Non-ECC Unbuffered DDR4\n" +
                "4 DIMMs, 5+3 Phases Pure Digital VRM Solution with Low RDS(on) MOSFETs\n" +
                "Ultra Durable™ PCIe 4.0 Ready x16 Slot\n" +
                "Dual Ultra-Fast NVMe PCIe 4.0/3.0 M.2 Connectors\n" +
                "Onboard Intel® Dual Band 802.11ac Wireless & BT 4.2 with WIFI Antenna\n" +
                "High Quality Audio Capacitors and Audio Noise Guard for Ultimate Audio Quality\n" +
                "GIGABYTE Exclusive 8118 Gaming GbE LAN with Bandwidth Management\n" +
                "Rear HDMI & DVI Support\n" +
                "RGB FUSION 2.0 Supports Addressable LED & RGB LED Strips\n" +
                "Smart Fan 5 Features Multiple Temperature Sensors\n" +
                "Hybrid Fan Headers with FAN STOP\n" +
                "Q-Flash Plus Update BIOS without Installing the CPU\n" +
                "Anti-Sulfur Resistors Design\n",
            "Gigabyte X570 UD Motherboard\n" +
                "\n" +
                "GIGABYTE X570 motherboards based on the AMD X570 Chipset provide full support for 3rd Gen AMD Ryzen™ Processors\n"
                "The all-new design is a testament to GIGABYTE’s dedication to design quality\n"
                "Offer a rich list of features such as support for PCIe 4.0 interfaces on select boards, refined audio,and high speed of Ethernet , to fulfill users performance, audio, and data transfer needs\n" +
                "The new, advanced power and thermal design enables users to unleash the performance on AMD Ryzen™ 3000-series Processors\n" +
                "Making the GIGABYTE X570 motherboards perfect for users looking to build the best AMD platform gaming system\n",
            "GIGABYTE Z590 AORUS MASTER Motherboard\n" +
                "\n" +
                "The latest flagship desktop processor from Intel, the Core i9-11900K\n" +
                "Has been out for over a month, and we’ve been busy putting numerous Z590 motherboards on tests to see how some of the motherboard options stack up against each other\n" +
                "Up for analysis today is GIGABYTE’s Z590 Aorus Master, which is one of its premium models and has plenty of high-quality features and controllers onboard\n" +
                "Based on the Aorus gaming series, the Z590 Aorus Master includes 10 gigabit Ethernet, Wi-Fi 6E, three M.2 slots, and large power delivery\n" +
                "From the specifications, it’s a behemoth but with an attractive price tag when compared to the flagship Z590 offerings\n" +
                "Another addition native USB 3.2 Gen2x2  connectivity, which is fantastic for content creators and users with compatible devices\n" +
                "Aside from the PCIe 4.0 support that the 11th generation Rocket Lake processors bring to the table\n",
            "Asus ROG Thor 850W 80+ Platinum Fully Modular Power Supply\n" +
                "\n" +
                "Inside and out, our first PSU is packed with innovative ideas\n" +
                "Externally, Aura Sync RGB illumination and an integrated OLED information panel enable unique customization and monitoring options for your ROG gaming rig\n" +
                "High-quality capacitors, a 135mm Wing-blade fan, and large heatsinks allow the ROG Thor 850W\n",
            "Corsair HX1200i 1200W 80+ Platinum Fully Modular Power Supply\n" +
                "\n" +
                "CORSAIR HXi Series™ power supplies give you extremely tight voltage control, virtually silent operation, and a fully modular cable set\n" +
                "They’re a great choice for high performance PCs where reliability is essential\n",
            "Gigabyte P550B 550W 80 PLUS Bronze Certified Power Supply\n" +
                "\n" +
                "550W Power Capacity with Powerful Single +12V Rail\n" +
                "80 PLUS Bronze certified\n" +
                "120mm Silent Hydraulic Bearing (HYB) Fan\n" +
                "Reliable flat cable\n" +
                "Single +12V rail\n" +
                "OVP/OPP/SCP/UVP/OCP/OTP protection\n",
            "Silverstone Strider Gold S ST85F-GS 850W 80+ Gold Fully Modular Power Supply\n" +
                "\n" +
                "Compact design with a depth of 140mm for easy integration (V2.0)\n" +
                "Strict ±2.5% voltage regulation and low ripple & noise (V2.0)\n" + 
                "24/7 continuous power output with 40℃ operating temperature\n" +       
                "80 PLUS Gold certification\n" +
                "100% modular cables\n" +
                "Class-leading single +12V rail\n" +
                "Silent running 120mm fan with 18dBA minimum\n"
            
    };

    static ArrayList<BestModel> getData(){
        ArrayList<BestModel> list = new ArrayList<>();
        for (int position = 0; position<(productName.length);position++){
            BestModel bestModel = new BestModel();
            bestModel.setTitle(productName[position]);
            bestModel.setImgProduct(imgProduct[position]);
            bestModel.setPrice(priceProduct[position]);
            list.add(bestModel);
        }
        return list;
    }

}
