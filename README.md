## Importmant
This repository is made to store my leetcode problem solving solutions when i feel working on.

## Language
Will be using c,c# and maybe other languages.



## Red Calculator ( Random Early Detection)

Random Early Detection (RED) is a congestion avoidance algorithm used in computer networks to prevent congestion before it occurs. It works by randomly dropping packets when the network becomes congested, with the goal of forcing the sending devices to reduce their transmission rate. This helps to prevent the network from becoming overloaded and ensures that all devices have a fair chance to use the available bandwidth.

The RED algorithm is implemented in routers and other networking devices, and it uses a number of parameters to determine when to drop packets. One of these parameters is the minimum threshold, which is the minimum level of congestion that must be reached before RED starts dropping packets. Another parameter is the maximum threshold, which is the level of congestion at which RED will start dropping all incoming packets.


To calculate the RED algorithm, the router or networking device looks at the current queue length, which is the number of packets waiting to be transmitted. If the queue length is below the minimum threshold, RED does nothing and all packets are transmitted as normal. If the queue length is between the minimum and maximum thresholds, RED starts dropping packets at a rate that increases with the level of congestion. If the queue length exceeds the maximum threshold, RED begins dropping all incoming packets.

The RED algorithm can be fine-tuned by adjusting the minimum and maximum thresholds and the rate at which packets are dropped as the queue length increases. These parameters can be set based on the specific needs of the network and the amount of available bandwidth.

In summary, the Random Early Detection (RED) algorithm is a congestion avoidance technique that helps to prevent network overload by randomly dropping packets when the network becomes congested. It uses a set of parameters, such as the minimum and maximum thresholds, to determine when and how many packets to drop in order to encourage sending devices to reduce their transmission rate and prevent congestion.


![RED Algorithm](../../../Downloads/Capture.PNG)/
![MAX_P](../../../Downloads/Capture2.PNG)