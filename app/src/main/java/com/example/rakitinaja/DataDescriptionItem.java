package com.example.rakitinaja;

import com.example.rakitinaja.model.BestModel;

import java.util.ArrayList;

public class DataDescriptionItem {

    private static final String[] productName =  {
            "Product A",
            "Product B",
            "Product C",
            "Product D"
    };

    private static final String[] priceProduct ={
            "Rp 6.300.000,-",
            "Rp 630.000,-",
            "Rp 7.600.000,-",
            "Rp 6.000.000,-"
    };

    private static final int[] imgProduct = {
            R.drawable.sample,
            R.drawable.sample,
            R.drawable.sample,
            R.drawable.sample
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
                    "\t\t*Operating System (OS) support will vary by manufacturer."
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
