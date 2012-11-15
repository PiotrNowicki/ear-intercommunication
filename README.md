Communication Between EARs Within One JVM / Application Server

Example of communication between two EAR's that resides on the **same JVM / Application Server**.

Usage of local business interfaces of the EJB's in such communication can be very misleading. It's prohibited 
by the EJB specification but many application server vendors are supporting it anyway. 

If you won't use them wisely you can fall into class loaders problems or non-portable behavior.