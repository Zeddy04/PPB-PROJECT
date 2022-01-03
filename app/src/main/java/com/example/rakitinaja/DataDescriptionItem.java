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
            "RAM Kingston FURY BEAST RAM DIMM 16GB 3200MHz DDR4 (Kit of 2) RGB"
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
            "Rp 1.420.000,-"
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
                "\t\t*Operating System (OS) support will vary by manufacturer.",
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
                "Max # of PCI Express Lanes : 20",
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
                "Accessories : Quick guide.",
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
                "DIGITAL MAXIMUM RESOLUTION : 7680x4320",
            "ASUS PRIME H310M-D\n" +
                "\n" +
                "Tahun Rilis    : 2019\n" +
                "Tipe Socket 	: Intel Socket 1151\n" +
                "Form Factor 	: mATX Form Factor\n" +
                "Tipe Chipset 	: Intel H310\n" +
                "Slot RAM 	: 2 x DIMM, Max. 32GB, DDR4 2666/2400/2133 MHz Non-ECC\n" +
                "Audio Chip 	: Front panel audio connector(s) (AAFP)\n" +
                "Tipe dan Jumlah USB 	: 4 x USB 3.1 & 6 x USB 2.0/1.1\n" +
                "fitur tambahan 	: Intel 14 nm CPU,Intel Extreme Memory Profile (XMP) productnation.",
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
                "Supports PCIe interface.",
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
                "* To support Windows® 7 64-bit, you must install an AMD Pinnacle Ridge & Summit Ridge CPU.",
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
                "OPP (Over Power)",
            "DOMINATOR PLATINUM RGB 16GB (2 x 8GB) DDR4 DRAM 3200MHz C16 Memory Kit.\n" +
                "Memory size: 32GB Kit (2 x 16GB)\n" +
                "Memory type: DDR4\n" +
                "SPD speed: 2133MHz\n" +
                "Speed rating: PC4-25600 (3200MHz)\n" +
                "Tested voltage: 1.35V",
            "Kingston FURY BEAST RAM DIMM 16GB 3200MHz DDR4 (Kit of 2) RGB.\n" +
                "Antarmuka: DDR4\n" +
                "Kapasitas: 16GB\n" +
                "Garansi: seumur hidup\n" +
                "\n" +
                "Cahaya RGB yang bisa dikustomisasi.\n" +
                "Teknologi Sinkronisasi Infra Merah Kingston FURY.\n" +
                "Plug N Play – Overclock otomatis hingga 3200 MHz.\n" +
                "Dioptimalkan untuk Intel XMP dan AMD Ryzen."          
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
